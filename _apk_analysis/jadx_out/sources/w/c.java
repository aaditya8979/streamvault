package w;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import chuangyuan.ycj.videolibrary.R$string;
import com.google.android.exoplayer.upstream.a;
import e5.i;
import e5.l;
import e5.r;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: MediaSourceBuilder.java */
/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f86256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f86257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t.b f86258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f86259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<String> f86260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f86261f;

    public c(@NonNull Context context) {
        this(context, null);
    }

    public c(@NonNull Context context, @Nullable t.b bVar) {
        this.f86259d = -1;
        this.f86258c = bVar;
        this.f86256a = context.getApplicationContext();
    }

    public void a() {
        t.b bVar = this.f86258c;
        if (bVar != null) {
            com.google.android.exoplayer.upstream.a aVarCreateDataSource = bVar.a().createDataSource();
            if (aVarCreateDataSource instanceof com.google.android.exoplayer.upstream.cache.a) {
                try {
                    ((com.google.android.exoplayer.upstream.cache.a) aVarCreateDataSource).close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            }
            this.f86258c = null;
        }
        this.f86259d = -1;
        this.f86260e = null;
    }

    public a.InterfaceC0296a b() {
        t.b bVar = this.f86258c;
        return bVar != null ? bVar.a() : new s.a(this.f86256a);
    }

    public int c() {
        return this.f86259d;
    }

    public r d() {
        return this.f86257b;
    }

    public List<String> e() {
        return this.f86260e;
    }

    public r f(Uri uri) {
        k4.e eVar = new k4.e();
        eVar.a(1);
        if (v.e.h(uri) != 3) {
            throw new IllegalStateException(this.f86256a.getString(R$string.media_error));
        }
        l.b bVarE = new l.b(b()).c(eVar).e(5);
        String string = this.f86261f;
        if (string == null) {
            string = uri.toString();
        }
        return bVarE.b(string).a(uri);
    }

    public void g(int i10) {
        r rVar = this.f86257b;
        if (rVar instanceof i) {
            i iVar = (i) rVar;
            iVar.T(i10).d(null);
            iVar.d0(i10);
        }
    }

    public void h(@NonNull Uri uri) {
        this.f86257b = f(uri);
    }
}
