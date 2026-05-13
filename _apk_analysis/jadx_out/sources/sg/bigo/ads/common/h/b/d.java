package sg.bigo.ads.common.h.b;

import android.content.Context;
import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f82193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InputStream f82194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f82195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f82196d;

    public d(Context context, a aVar) {
        this.f82196d = context;
        this.f82193a = aVar;
        sg.bigo.ads.common.h.a aVar2 = aVar.f82187b;
        this.f82195c = new File(aVar2.f82145c, sg.bigo.ads.common.utils.f.c(aVar2.f82146d));
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.h.b.d.a():void");
    }

    private void a(String str) {
        sg.bigo.ads.common.t.a.a(0, 3, IDownloadTask.TAG, str + ",taskId=" + this.f82193a.f82186a + ", downloadinfo = " + this.f82193a.toString());
    }

    private void b(String str) {
        sg.bigo.ads.common.t.a.a(0, IDownloadTask.TAG, str + " , " + this.f82193a.f82186a + " has a error ! " + this.f82193a.toString());
        a aVar = this.f82193a;
        aVar.f82191f = str;
        aVar.f82190e = h.f82207g;
        f.a().a(this.f82193a.f82186a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0109, code lost:
    
        if (r4 == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0111, code lost:
    
        if (sg.bigo.ads.common.utils.f.c(r9.f82195c) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0113, code lost:
    
        b("Failed to create temp file.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0118, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0119, code lost:
    
        r9.f82193a.f82190e = sg.bigo.ads.common.h.b.h.f82203c;
        sg.bigo.ads.common.h.b.f.a().a(r9.f82193a.f82186a);
        a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x012d, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.h.b.d.run():void");
    }
}
