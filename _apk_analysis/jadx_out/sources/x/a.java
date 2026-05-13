package x;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.source.dash.DashMediaSource;
import com.google.android.exoplayer.source.dash.c;
import com.google.android.exoplayer.source.hls.HlsMediaSource;
import com.google.android.exoplayer.source.smoothstreaming.SsMediaSource;
import com.google.android.exoplayer.source.smoothstreaming.a;
import e5.l;
import e5.r;
import t.b;
import v.e;
import w.c;
import y5.q;

/* JADX INFO: compiled from: WholeMediaSource.java */
/* JADX INFO: loaded from: classes8.dex */
public class a extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f86716g = 0;

    public a(@NonNull Context context) {
        super(context);
    }

    public a(@NonNull Context context, @Nullable b bVar) {
        super(context, bVar);
    }

    @Override // w.c
    public r f(@NonNull Uri uri) {
        int iH = e.h(uri);
        if (iH == 0) {
            return new DashMediaSource.Factory(new c.a(b()), new com.google.android.exoplayer.upstream.c(this.f86256a, (q) null, b())).e(5).b(10000L).a(uri);
        }
        if (iH == 1) {
            return new SsMediaSource.Factory(new a.C0292a(b()), new com.google.android.exoplayer.upstream.c(this.f86256a, (q) null, b())).d(5).b(10000L).a(uri);
        }
        if (iH == 2) {
            return new HlsMediaSource.Factory(new j5.b(b())).b(true).d(5).c(new j5.c()).a(uri);
        }
        if (iH != 3) {
            throw new IllegalStateException(":Unsupported type: " + iH);
        }
        l.b bVarC = new l.b(b()).c(new k4.e());
        String string = this.f86261f;
        if (string == null) {
            string = uri.toString();
        }
        return bVarC.b(string).e(5).a(uri);
    }
}
