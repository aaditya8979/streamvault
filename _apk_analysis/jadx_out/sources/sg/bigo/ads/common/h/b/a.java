package sg.bigo.ads.common.h.b;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f82186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sg.bigo.ads.common.h.a f82187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f82188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f82189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f82190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f82191f;

    public a(@NonNull sg.bigo.ads.common.h.a aVar) {
        this.f82187b = aVar;
        this.f82186a = aVar.f82143a;
    }

    public final void a(long j10) {
        this.f82187b.f82151i = j10;
    }

    public final void b(long j10) {
        this.f82187b.f82149g = j10;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != a.class) {
            return false;
        }
        a aVar = (a) obj;
        return this.f82186a.equals(aVar.f82186a) && this.f82187b.f82146d.equals(aVar.f82187b.f82146d) && this.f82187b.f82145c.equals(aVar.f82187b.f82145c);
    }

    public String toString() {
        return this.f82187b.toString();
    }
}
