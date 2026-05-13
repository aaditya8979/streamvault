package com.bykv.vk.openvk.ouw.ouw.vt.ouw.vt;

import android.content.Context;
import com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw;
import java.io.Closeable;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vt {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public File f11323lh;
    public com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private Context f11324ra;
    public File yu;
    public volatile boolean vt = false;
    public final List<ouw.InterfaceC0167ouw> fkw = new ArrayList();

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public volatile boolean f11322le = false;

    public vt(Context context, com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar) {
        this.f11323lh = null;
        this.yu = null;
        this.f11324ra = context;
        this.ouw = lhVar;
        this.f11323lh = com.bykv.vk.openvk.ouw.ouw.vt.yu.vt.ouw(lhVar.f11272lh, lhVar.bly());
        this.yu = com.bykv.vk.openvk.ouw.ouw.vt.yu.vt.vt(lhVar.f11272lh, lhVar.bly());
    }

    public static /* synthetic */ void ouw(vt vtVar, com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar, int i10) {
        synchronized (ouw.InterfaceC0167ouw.class) {
            for (ouw.InterfaceC0167ouw interfaceC0167ouw : vtVar.fkw) {
                if (interfaceC0167ouw != null) {
                    interfaceC0167ouw.vt(lhVar, i10);
                }
            }
        }
    }

    public static /* synthetic */ void ouw(vt vtVar, com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar, int i10, String str) {
        synchronized (ouw.InterfaceC0167ouw.class) {
            for (ouw.InterfaceC0167ouw interfaceC0167ouw : vtVar.fkw) {
                if (interfaceC0167ouw != null) {
                    interfaceC0167ouw.ouw(lhVar, i10, str);
                }
            }
        }
    }

    public static /* synthetic */ void ouw(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar, int i10) {
        synchronized (ouw.InterfaceC0167ouw.class) {
            for (ouw.InterfaceC0167ouw interfaceC0167ouw : this.fkw) {
                if (interfaceC0167ouw != null) {
                    interfaceC0167ouw.ouw(lhVar, i10);
                }
            }
        }
    }
}
