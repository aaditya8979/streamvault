package md;

import android.content.Context;
import com.mgs.carparking.widgets.cache.model.Type;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: LoaderFactory.java */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f74115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, d> f74116b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, d> f74117c = new HashMap();

    /* JADX INFO: compiled from: LoaderFactory.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f74118a;

        static {
            int[] iArr = new int[Type.values().length];
            f74118a = iArr;
            try {
                iArr[Type.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74118a[Type.IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public c(Context context) {
        this.f74115a = context.getApplicationContext();
    }

    public synchronized <D> d<D> a(String str, Type type) {
        return b(str, type);
    }

    public final synchronized <D> d<D> b(String str, Type type) {
        d<D> dVarC = c(str, type);
        if (dVarC != null) {
            return dVarC;
        }
        d<D> eVar = null;
        int i10 = a.f74118a[type.ordinal()];
        if (i10 == 1) {
            eVar = new e<>(str, this.f74115a);
            this.f74116b.put(str, eVar);
        } else if (i10 == 2) {
            eVar = new b<>(str, this.f74115a);
            this.f74117c.put(str, eVar);
        }
        return eVar;
    }

    public final <D> d<D> c(String str, Type type) {
        int i10 = a.f74118a[type.ordinal()];
        if (i10 == 1) {
            return this.f74116b.get(str);
        }
        if (i10 != 2) {
            return null;
        }
        return this.f74117c.get(str);
    }
}
