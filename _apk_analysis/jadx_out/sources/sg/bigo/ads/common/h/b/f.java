package sg.bigo.ads.common.h.b;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes9.dex */
final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static f f82197b = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap<String, CopyOnWriteArrayList<e>> f82198a = new HashMap<>();

    /* JADX INFO: renamed from: sg.bigo.ads.common.h.b.f$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f82199a;

        static {
            int[] iArr = new int[h.a().length];
            f82199a = iArr;
            try {
                iArr[h.f82201a - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f82199a[h.f82202b - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f82199a[h.f82203c - 1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f82199a[h.f82204d - 1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f82199a[h.f82205e - 1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f82199a[h.f82206f - 1] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f82199a[h.f82207g - 1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static f a() {
        return f82197b;
    }

    private void a(String str, e eVar) {
        CopyOnWriteArrayList<e> copyOnWriteArrayList;
        if (this.f82198a.containsKey(str) && (copyOnWriteArrayList = this.f82198a.get(str)) != null && copyOnWriteArrayList.contains(eVar)) {
            copyOnWriteArrayList.remove(eVar);
        }
    }

    private void a(a aVar, CopyOnWriteArrayList<e> copyOnWriteArrayList) {
        switch (AnonymousClass1.f82199a[aVar.f82190e - 1]) {
            case 1:
                Iterator<e> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                break;
            case 2:
                Iterator<e> it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
                break;
            case 3:
                Iterator<e> it3 = copyOnWriteArrayList.iterator();
                while (it3.hasNext()) {
                    it3.next().a(aVar.f82186a);
                }
                break;
            case 4:
                for (e eVar : copyOnWriteArrayList) {
                    String str = aVar.f82186a;
                    j.a(aVar.f82189d);
                    eVar.b(str);
                }
                break;
            case 5:
                Iterator<e> it4 = copyOnWriteArrayList.iterator();
                while (it4.hasNext()) {
                    it4.next().c(aVar.f82186a);
                }
                break;
            case 6:
                for (e eVar2 : copyOnWriteArrayList) {
                    eVar2.d(aVar.f82186a);
                    a(aVar.f82186a, eVar2);
                }
                break;
            case 7:
                for (e eVar3 : copyOnWriteArrayList) {
                    eVar3.a(aVar.f82186a, aVar.f82191f, aVar.f82187b.f82149g);
                    a(aVar.f82186a, eVar3);
                }
                break;
        }
    }

    public final void a(String str) {
        CopyOnWriteArrayList<e> copyOnWriteArrayList;
        a aVarC;
        if (!this.f82198a.containsKey(str) || (copyOnWriteArrayList = this.f82198a.get(str)) == null || (aVarC = i.c(str)) == null) {
            return;
        }
        a(aVarC, copyOnWriteArrayList);
    }

    public final void b(String str) {
        if (!this.f82198a.containsKey(str) || this.f82198a.get(str) == null) {
            return;
        }
        this.f82198a.get(str).clear();
    }
}
