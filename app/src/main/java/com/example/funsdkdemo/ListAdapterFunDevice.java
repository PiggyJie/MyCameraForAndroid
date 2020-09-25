package com.example.funsdkdemo;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;

import com.lib.funsdk.support.models.FunDevice;

public class ListAdapterFunDevice extends BaseExpandableListAdapter {

    public interface OnFunDeviceItemClickListener {
//        void onFunDeviceRenameClicked(FunDevice funDevice);

        void onFunDeviceConnectClicked(FunDevice funDevice);

        void onFunDeviceControlClicked(FunDevice funDevice);

//        void onFunDeviceAlarmClicked(FunDevice funDevice);
//
//        void onFunDeviceTransComClicked(FunDevice funDevice);
//
//        void onFunDeviceRemoveClicked(FunDevice funDevice);
//
//        void onFunDevice433AddSub(FunDevice funDevice);
//
//        void onFunDevice433Control(FunDevice funDevice);
//
//        void onFunDeviceWakeUp(FunDevice funDevice);
//
//        void onFunDeviceCloud(FunDevice funDevice);
//
//        void onFunDeviceTest(FunDevice funDevice);
    }
    @Override
    public int getGroupCount() {
        return 0;
    }

    @Override
    public int getChildrenCount(int i) {
        return 0;
    }

    @Override
    public Object getGroup(int i) {
        return null;
    }

    @Override
    public Object getChild(int i, int i1) {
        return null;
    }

    @Override
    public long getGroupId(int i) {
        return 0;
    }

    @Override
    public long getChildId(int i, int i1) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
        return null;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        return null;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return false;
    }
}
