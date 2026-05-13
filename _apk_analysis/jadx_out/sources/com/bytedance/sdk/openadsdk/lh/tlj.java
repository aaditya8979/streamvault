package com.bytedance.sdk.openadsdk.lh;

import android.os.RemoteException;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.yu.ra;
import com.bytedance.sdk.openadsdk.utils.bs;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class tlj {
    public String bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public String f14179cf;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public JSONObject f14180jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public String f14181ko;
    public String mwh;
    private int qbp;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public vpp f14184rn;
    public IListenerManager ryl;
    public String tlj;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public FilterWord f14186vm;
    public int zih;
    public static FilterWord ouw = new FilterWord("", "");
    public static int vt = 1;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public static int f14178lh = 2;
    public static int yu = 3;
    public static int fkw = 4;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private final Set<lh> f14185th = new HashSet();

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public final Set<vt> f14182le = new HashSet();

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public final Set<yu> f14183ra = new HashSet();
    public final Set<ouw> pno = new HashSet();

    public interface lh {
        void ouw(FilterWord filterWord);
    }

    public interface ouw {
        void ouw(List<FilterWord> list);
    }

    public interface vt {
        void ouw(int i10);
    }

    public interface yu {
        void ouw(String str);
    }

    private void le() {
        Iterator<lh> it = this.f14185th.iterator();
        while (it.hasNext()) {
            it.next().ouw(this.f14186vm);
        }
    }

    public static void ouw(final String str) {
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            bs.fkw(new com.bytedance.sdk.component.pno.pno("DislikeClosed_unregisterMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.lh.tlj.3
                public final /* synthetic */ int ouw = 6;

                @Override // java.lang.Runnable
                public final void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.ouw ouwVarOuw = com.bytedance.sdk.openadsdk.multipro.aidl.ouw.ouw();
                    if (this.ouw == 6) {
                        try {
                            ko.vt("TTDislikeManager", "start unregisterDislikeClickCloseListener ! ");
                            IListenerManager iListenerManagerAsInterface = IListenerManager.Stub.asInterface(ouwVarOuw.ouw(6));
                            if (iListenerManagerAsInterface != null) {
                                iListenerManagerAsInterface.unregisterDisLikeClosedListener(str);
                                ko.vt("TTDislikeManager", "end unregisterDislikeClickCloseListener ! ");
                            }
                        } catch (RemoteException unused) {
                            ko.vt("TTDislikeManager", "multiProcess unregisterMultiProcessListener error");
                        }
                    }
                }
            });
        }
    }

    public static void ouw(final String str, final ra.ouw ouwVar) {
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            bs.fkw(new com.bytedance.sdk.component.pno.pno("DislikeClosed_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.lh.tlj.2
                public final /* synthetic */ int ouw = 6;

                @Override // java.lang.Runnable
                public final void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.ouw ouwVarOuw = com.bytedance.sdk.openadsdk.multipro.aidl.ouw.ouw();
                    if (this.ouw != 6 || ouwVar == null) {
                        return;
                    }
                    try {
                        ko.vt("TTDislikeManager", "start registerDislikeClickCloseListener ! ");
                        com.bytedance.sdk.openadsdk.multipro.aidl.vt.vt vtVar = new com.bytedance.sdk.openadsdk.multipro.aidl.vt.vt(str, ouwVar);
                        IListenerManager iListenerManagerAsInterface = IListenerManager.Stub.asInterface(ouwVarOuw.ouw(6));
                        if (iListenerManagerAsInterface != null) {
                            iListenerManagerAsInterface.registerDisLikeClosedListener(str, vtVar);
                            ko.vt("TTDislikeManager", "end registerDislikeClickCloseListener ! ");
                        }
                    } catch (RemoteException e10) {
                        qbp.lh("TTDislikeManager", e10.getMessage());
                        ko.vt("TTDislikeManager", "multiProcess registerDislikeClickCloseListener error");
                    }
                }
            });
        }
    }

    public final boolean fkw() {
        return this.zih < this.qbp;
    }

    public final void lh() {
        Iterator<vt> it = this.f14182le.iterator();
        while (it.hasNext()) {
            it.next().ouw(f14178lh);
        }
    }

    public final void ouw() {
        this.f14185th.clear();
        this.f14182le.clear();
        this.f14183ra.clear();
        this.pno.clear();
    }

    public final void ouw(int i10, int i11) {
        this.zih = i10;
        this.qbp = i11;
    }

    public final void ouw(FilterWord filterWord) {
        this.f14186vm = filterWord;
        le();
    }

    public final void ouw(lh lhVar) {
        this.f14185th.add(lhVar);
    }

    public final void ouw(vt vtVar) {
        this.f14182le.add(vtVar);
    }

    public final void ouw(String str, vpp vppVar) {
        this.f14181ko = str;
        this.f14184rn = vppVar;
    }

    public final void ouw(List<FilterWord> list) {
        Iterator<ouw> it = this.pno.iterator();
        while (it.hasNext()) {
            it.next().ouw(list);
        }
    }

    public final void vt(String str) {
        this.mwh = str;
        Iterator<yu> it = this.f14183ra.iterator();
        while (it.hasNext()) {
            it.next().ouw(this.mwh);
        }
    }

    public final boolean vt() {
        FilterWord filterWord = this.f14186vm;
        return (filterWord == null || filterWord.equals(ouw)) ? false : true;
    }

    public final IListenerManager yu() {
        if (this.ryl == null) {
            this.ryl = IListenerManager.Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.ouw.ouw().ouw(6));
        }
        return this.ryl;
    }
}
