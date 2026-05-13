package com.mbridge.msdk.mbnative.listener;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeListener;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: AdListenerProxy.java */
/* JADX INFO: loaded from: classes2.dex */
public class a implements NativeListener.NativeAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private NativeListener.NativeAdListener f38771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f38772b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f38773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f38774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f38775e;

    public a() {
    }

    public a(NativeListener.NativeAdListener nativeAdListener) {
        this.f38771a = nativeAdListener;
    }

    public void a(CampaignEx campaignEx, String str) {
        this.f38772b = false;
        NativeListener.NativeAdListener nativeAdListener = this.f38771a;
        if (nativeAdListener != null) {
            nativeAdListener.onAdLoadError(str);
            if (this.f38774d == null) {
                this.f38774d = c.n().d();
            }
            if (TextUtils.isEmpty(this.f38773c)) {
                return;
            }
            com.mbridge.msdk.mbnative.report.a.a(this.f38774d, str, this.f38773c, this.f38775e, campaignEx);
        }
    }

    public void a(String str) {
        this.f38773c = str;
    }

    public void a(boolean z10) {
        this.f38775e = z10;
    }

    public boolean a() {
        return this.f38772b;
    }

    public void b() {
        this.f38772b = true;
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdClick(Campaign campaign) {
        NativeListener.NativeAdListener nativeAdListener = this.f38771a;
        if (nativeAdListener != null) {
            nativeAdListener.onAdClick(campaign);
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdFramesLoaded(List<Frame> list) {
        NativeListener.NativeAdListener nativeAdListener = this.f38771a;
        if (nativeAdListener != null) {
            nativeAdListener.onAdFramesLoaded(list);
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdLoadError(String str) {
        this.f38772b = false;
        NativeListener.NativeAdListener nativeAdListener = this.f38771a;
        if (nativeAdListener != null) {
            nativeAdListener.onAdLoadError(str);
            if (this.f38774d == null) {
                this.f38774d = c.n().d();
            }
            if (TextUtils.isEmpty(this.f38773c)) {
                return;
            }
            com.mbridge.msdk.mbnative.report.a.a(this.f38774d, str, this.f38773c, this.f38775e, (CampaignEx) null);
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdLoaded(List<Campaign> list, int i10) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        try {
            this.f38772b = false;
            synchronized (list) {
                copyOnWriteArrayList = new CopyOnWriteArrayList(list);
            }
            if (this.f38771a != null) {
                if (copyOnWriteArrayList.size() > 0) {
                    this.f38771a.onAdLoaded(copyOnWriteArrayList, i10);
                } else {
                    this.f38771a.onAdLoaded(list, i10);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onLoggingImpression(int i10) {
        NativeListener.NativeAdListener nativeAdListener = this.f38771a;
        if (nativeAdListener != null) {
            nativeAdListener.onLoggingImpression(i10);
        }
    }
}
