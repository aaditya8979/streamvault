package v5;

import a6.m;
import android.text.Layout;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: WebvttCue.java */
/* JADX INFO: loaded from: classes12.dex */
public final class e extends n5.b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f85893q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f85894r;

    /* JADX INFO: compiled from: WebvttCue.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f85895a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f85896b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public CharSequence f85897c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f85898d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f85899e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f85900f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f85901g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f85902h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f85903i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f85904j;

        public b() {
            g();
        }

        public static float b(float f10, int i10) {
            if (f10 == -3.4028235E38f || i10 != 0 || (f10 >= 0.0f && f10 <= 1.0f)) {
                return f10 != -3.4028235E38f ? f10 : i10 == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        @Nullable
        public static Layout.Alignment c(int i10) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            m.h("WebvttCueBuilder", "Unknown textAlignment: " + i10);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        public static float d(int i10, float f10) {
            if (i10 == 0) {
                return 1.0f - f10;
            }
            if (i10 == 1) {
                return f10 <= 0.5f ? f10 * 2.0f : (1.0f - f10) * 2.0f;
            }
            if (i10 == 2) {
                return f10;
            }
            throw new IllegalStateException(String.valueOf(i10));
        }

        public static float e(int i10) {
            if (i10 != 4) {
                return i10 != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        public static int f(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 3) {
                return 2;
            }
            if (i10 != 4) {
                return i10 != 5 ? 1 : 2;
            }
            return 0;
        }

        public e a() {
            this.f85899e = b(this.f85899e, this.f85900f);
            if (this.f85902h == -3.4028235E38f) {
                this.f85902h = e(this.f85898d);
            }
            if (this.f85903i == Integer.MIN_VALUE) {
                this.f85903i = f(this.f85898d);
            }
            this.f85904j = Math.min(this.f85904j, d(this.f85903i, this.f85902h));
            return new e(this.f85895a, this.f85896b, (CharSequence) a6.a.e(this.f85897c), c(this.f85898d), this.f85899e, this.f85900f, this.f85901g, this.f85902h, this.f85903i, this.f85904j);
        }

        public void g() {
            this.f85895a = 0L;
            this.f85896b = 0L;
            this.f85897c = null;
            this.f85898d = 2;
            this.f85899e = -3.4028235E38f;
            this.f85900f = 1;
            this.f85901g = 0;
            this.f85902h = -3.4028235E38f;
            this.f85903i = Integer.MIN_VALUE;
            this.f85904j = 1.0f;
        }

        public b h(long j10) {
            this.f85896b = j10;
            return this;
        }

        public b i(float f10) {
            this.f85899e = f10;
            return this;
        }

        public b j(int i10) {
            this.f85901g = i10;
            return this;
        }

        public b k(int i10) {
            this.f85900f = i10;
            return this;
        }

        public b l(float f10) {
            this.f85902h = f10;
            return this;
        }

        public b m(int i10) {
            this.f85903i = i10;
            return this;
        }

        public b n(long j10) {
            this.f85895a = j10;
            return this;
        }

        public b o(CharSequence charSequence) {
            this.f85897c = charSequence;
            return this;
        }

        public b p(int i10) {
            this.f85898d = i10;
            return this;
        }

        public b q(float f10) {
            this.f85904j = f10;
            return this;
        }
    }

    public e(long j10, long j11, CharSequence charSequence, @Nullable Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12) {
        super(charSequence, alignment, f10, i10, i11, f11, i12, f12);
        this.f85893q = j10;
        this.f85894r = j11;
    }

    public boolean a() {
        return this.f75129e == -3.4028235E38f && this.f75132h == 0.5f;
    }
}
