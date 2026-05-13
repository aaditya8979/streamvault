package com.mbridge.msdk.foundation.same.webview;

import android.webkit.DownloadListener;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: compiled from: MBDownloadListener.java */
/* JADX INFO: loaded from: classes4.dex */
public class a implements DownloadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f38012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CampaignEx f38013b;

    public a(CampaignEx campaignEx) {
        this.f38013b = campaignEx;
    }

    public void a(String str) {
        this.f38012a = str;
    }

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
    }
}
