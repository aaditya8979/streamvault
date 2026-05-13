package com.mbridge.msdk.foundation.controller.authoritycontroller;

import android.text.TextUtils;

/* JADX INFO: compiled from: BaseAuthorityInfoBean.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37380d;

    public void a(int i10) {
        this.f37377a = i10;
        this.f37378b = i10;
        this.f37379c = i10;
    }

    public void authDeviceIdStatus(int i10) {
        this.f37378b = i10;
    }

    public void authGenDataStatus(int i10) {
        this.f37377a = i10;
    }

    public void authOtherDataStatus(int i10) {
        this.f37380d = i10;
    }

    public void authSerialIdStatus(int i10) {
        this.f37379c = i10;
    }

    public int getAuthDeviceIdStatus() {
        return this.f37378b;
    }

    public int getAuthGenDataStatus() {
        return this.f37377a;
    }

    public int getAuthSerialIdStatus() {
        return this.f37379c;
    }

    public int getOtherDataStatus() {
        return this.f37380d;
    }

    public int getStatusByKey(String str) {
        if (!TextUtils.isEmpty(str)) {
            str.hashCode();
            switch (str) {
                case "authority_serial_id":
                    return this.f37379c;
                case "authority_device_id":
                    return this.f37378b;
                case "authority_general_data":
                    return this.f37377a;
                case "authority_other":
                    return this.f37380d;
            }
        }
        return 1;
    }
}
