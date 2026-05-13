package g4;

import a6.k0;
import android.annotation.TargetApi;
import android.media.AudioAttributes;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: AudioAttributes.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f61933f = new b().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f61934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f61935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f61936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f61937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public AudioAttributes f61938e;

    /* JADX INFO: compiled from: AudioAttributes.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f61939a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f61940b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f61941c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f61942d = 1;

        public c a() {
            return new c(this.f61939a, this.f61940b, this.f61941c, this.f61942d);
        }
    }

    public c(int i10, int i11, int i12, int i13) {
        this.f61934a = i10;
        this.f61935b = i11;
        this.f61936c = i12;
        this.f61937d = i13;
    }

    @TargetApi(21)
    public AudioAttributes a() {
        if (this.f61938e == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f61934a).setFlags(this.f61935b).setUsage(this.f61936c);
            if (k0.f3574a >= 29) {
                usage.setAllowedCapturePolicy(this.f61937d);
            }
            this.f61938e = usage.build();
        }
        return this.f61938e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f61934a == cVar.f61934a && this.f61935b == cVar.f61935b && this.f61936c == cVar.f61936c && this.f61937d == cVar.f61937d;
    }

    public int hashCode() {
        return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f61934a) * 31) + this.f61935b) * 31) + this.f61936c) * 31) + this.f61937d;
    }
}
