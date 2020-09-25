package com.lib.funsdk.support.models;

import com.basic.G;
import com.lib.funsdk.support.config.BaseConfig;
import com.lib.sdk.struct.SDBDeviceInfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunDevice {
    public String devSn;		// 设备序列号
    public String devMac;		// 设备MAC
    public String devName;		// 设备名称
    public String devIp;		// 设备IP
    public String loginName;	// 设备登录名
    public String loginPsw;		// 设备登录密码
    public FunDevType devType;	// 设备类型
    public int tcpPort;

//    public SDK_ChannelNameConfigAll channel;
    public int CurrChannel = 0;		//当前播放通道号,默认为零

    public boolean isRemote;	// 是否是一个远程设备

    public FunDevStatus devStatus;	// 是否在线(状态)
    public int devStatusValue;		// 设备状态值,记录了不同协议P2P,DSS等的状态信息

    protected Map<String, BaseConfig> configMap = new HashMap<String, BaseConfig>();

//    public List<FunFileData> mDatas;

    private int nNetConnnectType = -1; // 0: p2p 1:转发 2IP直连

    // 设备是否已经登录标志
    private boolean mHasLogin = false;
    // 是否已验证funDevice密码的正确性
    private boolean servicepsd = false;

    // 保存设备连接状态, 记录的是：EUIMSG.DEV_ON_RECONNECT和EUIMSG.DEV_ON_DISCONNECT
    private boolean mHasConnected = false;

    //云存储状态
//    private int cloudState;

    private long cloudExpired;//到期时间 单位秒
    public FunDevice() {

    }

    // 新的设备,来自用户
    public void initWith(SDBDeviceInfo devInfo) {
        this.devMac = G.ToString(devInfo.st_0_Devmac);
        this.devSn = this.devMac;
        this.devName = G.ToString(devInfo.st_1_Devname);
        if ( null != this.devName ) {
            this.devName = G.UnescapeHtml3(this.devName);
        }
        this.devIp = G.ToString(devInfo.st_2_Devip);
        this.loginName = G.ToString(devInfo.st_4_loginName);
        this.loginPsw = G.ToString(devInfo.st_5_loginPsw);
        this.tcpPort = devInfo.st_6_nDMZTcpPort;
        this.devType = FunDevType.getType(devInfo.st_7_nType);
        this.isRemote = true;
        this.devStatus = FunDevStatus.STATUS_UNKNOWN;
    }

}
