package sg.bigo.ads.common;

import android.content.Context;
import android.os.Parcel;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class e implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Context f81994b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f81993a = new Runnable() { // from class: sg.bigo.ads.common.e.1
        @Override // java.lang.Runnable
        public final void run() {
            e eVar = e.this;
            eVar.c(eVar.f81994b);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f81995c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f81996d = false;

    public e(@NonNull Context context) {
        this.f81994b = context;
    }

    @CallSuper
    private void B() {
        this.f81995c = true;
        sg.bigo.ads.common.t.a.a(0, 3, b(), "onDataSaved, ".concat(String.valueOf(this)));
    }

    public abstract String a();

    public final void a(long j10) {
        sg.bigo.ads.common.n.d.a(this.f81993a);
        if (j10 <= 0) {
            sg.bigo.ads.common.n.d.a(1, this.f81993a);
        } else {
            sg.bigo.ads.common.n.d.a(1, this.f81993a, j10);
        }
    }

    @CallSuper
    public void a(Context context) {
        this.f81995c = true;
        sg.bigo.ads.common.t.a.a(0, 3, b(), "onDataLoaded, ".concat(String.valueOf(this)));
    }

    public abstract String b();

    public final synchronized void b(Context context) {
        ByteArrayInputStream byteArrayInputStream = null;
        try {
            try {
                File file = new File(o.a(context), a());
                this.f81996d = file.exists();
                byte[] bArrB = sg.bigo.ads.common.utils.g.b(file);
                if (bArrB == null) {
                    sg.bigo.ads.common.t.a.a(0, 4, b(), "data file not exist");
                    a(context);
                    return;
                }
                byte[] bArrB2 = sg.bigo.ads.common.utils.o.b(bArrB);
                if (bArrB2 == null) {
                    sg.bigo.ads.common.t.a.a(0, b(), "data decrypt failed length=" + bArrB.length);
                    file.delete();
                    a(context);
                    return;
                }
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrB2);
                try {
                    int iAvailable = byteArrayInputStream2.available();
                    byte[] bArr = new byte[iAvailable];
                    byteArrayInputStream2.read(bArr);
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.unmarshall(bArr, 0, iAvailable);
                    parcelObtain.setDataPosition(0);
                    b(parcelObtain);
                    try {
                        byteArrayInputStream2.close();
                    } catch (IOException unused) {
                        sg.bigo.ads.common.t.a.a(0, 5, b(), "close data input stream failed");
                    }
                    a(context);
                } catch (Exception unused2) {
                    byteArrayInputStream = byteArrayInputStream2;
                    sg.bigo.ads.common.t.a.a(0, 5, b(), "DataFile load failed");
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException unused3) {
                            sg.bigo.ads.common.t.a.a(0, 5, b(), "close data input stream failed");
                        }
                    }
                    a(context);
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayInputStream = byteArrayInputStream2;
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException unused4) {
                            sg.bigo.ads.common.t.a.a(0, 5, b(), "close data input stream failed");
                        }
                    }
                    a(context);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception unused5) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:15|(2:17|(2:19|(2:21|22))(2:23|(2:25|22)))|(2:95|27)|(4:103|28|(1:32)|33)|100|47|88|48|51|52|53) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0134, code lost:
    
        sg.bigo.ads.common.t.a.a(0, 5, b(), "close output stream failed");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void c(android.content.Context r11) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.e.c(android.content.Context):void");
    }
}
