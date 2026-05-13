package y9;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.liulishuo.filedownloader.event.DownloadServiceConnectChangedEvent;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.services.FileDownloadService;
import ga.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: FileDownloadServiceSharedTransmit.java */
/* JADX INFO: loaded from: classes10.dex */
public class o implements v, e.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class<?> f87454e = FileDownloadService.SharedMainProcessService.class;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f87455b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<Runnable> f87456c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ga.e f87457d;

    @Override // ga.e.a
    public void a(ga.e eVar) {
        this.f87457d = eVar;
        List list = (List) this.f87456c.clone();
        this.f87456c.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        f.e().b(new DownloadServiceConnectChangedEvent(DownloadServiceConnectChangedEvent.ConnectStatus.connected, f87454e));
    }

    @Override // y9.v
    public boolean isConnected() {
        return this.f87457d != null;
    }

    @Override // y9.v
    public boolean m() {
        return this.f87455b;
    }

    @Override // y9.v
    public void n(Context context, Runnable runnable) {
        if (runnable != null && !this.f87456c.contains(runnable)) {
            this.f87456c.add(runnable);
        }
        Intent intent = new Intent(context, f87454e);
        boolean zP = ia.f.P(context);
        this.f87455b = zP;
        intent.putExtra("is_foreground", zP);
        if (!this.f87455b) {
            context.startService(intent);
            return;
        }
        if (ia.d.f64033a) {
            ia.d.a(this, "start foreground service", new Object[0]);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        }
    }

    @Override // y9.v
    public void o(Context context) {
        n(context, null);
    }

    @Override // y9.v
    public boolean q(int i10) {
        return !isConnected() ? ia.a.c(i10) : this.f87457d.q(i10);
    }

    @Override // y9.v
    public void r(boolean z10) {
        if (!isConnected()) {
            ia.a.e(z10);
        } else {
            this.f87457d.r(z10);
            this.f87455b = false;
        }
    }

    @Override // y9.v
    public byte s(int i10) {
        return !isConnected() ? ia.a.a(i10) : this.f87457d.s(i10);
    }

    @Override // y9.v
    public boolean t(String str, String str2, boolean z10, int i10, int i11, int i12, boolean z11, FileDownloadHeader fileDownloadHeader, boolean z12) {
        if (!isConnected()) {
            return ia.a.d(str, str2, z10);
        }
        this.f87457d.t(str, str2, z10, i10, i11, i12, z11, fileDownloadHeader, z12);
        return true;
    }
}
