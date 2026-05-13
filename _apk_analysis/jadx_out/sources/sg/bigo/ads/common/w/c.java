package sg.bigo.ads.common.w;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.ArrayMap;
import android.util.SparseBooleanArray;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@RequiresApi(api = 19)
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f82782b = new b() { // from class: sg.bigo.ads.common.w.c.1
        @Override // sg.bigo.ads.common.w.c.b
        public final boolean a(float[] fArr) {
            float f10 = fArr[2];
            if (!(f10 >= 0.95f)) {
                if (!(f10 <= 0.05f)) {
                    float f11 = fArr[1];
                    if (!((f11 <= 0.1f && f10 >= 0.55f) || (f11 <= 0.5f && f10 >= 0.75f) || (f11 <= 0.2f && f10 >= 0.7f))) {
                        float f12 = fArr[0];
                        if (!(f12 >= 10.0f && f12 <= 37.0f && f11 <= 0.82f)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<C1032c> f82784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<d> f82785d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SparseBooleanArray f82787f = new SparseBooleanArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<d, C1032c> f82786e = new ArrayMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final C1032c f82783a = b();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Bitmap f82788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<d> f82789b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f82790c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f82791d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f82792e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List<b> f82793f;

        public a(@NonNull Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.f82789b = arrayList;
            this.f82790c = 16;
            this.f82791d = 12544;
            this.f82792e = -1;
            ArrayList arrayList2 = new ArrayList();
            this.f82793f = arrayList2;
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            arrayList2.add(c.f82782b);
            this.f82788a = bitmap;
            arrayList.add(d.f82800a);
        }
    }

    public interface b {
        boolean a(@NonNull float[] fArr);
    }

    /* JADX INFO: renamed from: sg.bigo.ads.common.w.c$c, reason: collision with other inner class name */
    public static final class C1032c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f82794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f82795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f82796c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f82797d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f82798e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        private float[] f82799f;

        public C1032c(@ColorInt int i10, int i11) {
            this.f82796c = Color.red(i10);
            this.f82797d = Color.green(i10);
            this.f82798e = Color.blue(i10);
            this.f82794a = i10;
            this.f82795b = i11;
        }

        @NonNull
        public final float[] a() {
            if (this.f82799f == null) {
                this.f82799f = new float[3];
            }
            sg.bigo.ads.common.w.b.a(this.f82796c, this.f82797d, this.f82798e, this.f82799f);
            return this.f82799f;
        }
    }

    public c(List<C1032c> list, List<d> list2) {
        this.f82784c = list;
        this.f82785d = list2;
    }

    @NonNull
    public static a a(@NonNull Bitmap bitmap) {
        return new a(bitmap);
    }

    @Nullable
    private C1032c b() {
        int size = this.f82784c.size();
        int i10 = Integer.MIN_VALUE;
        C1032c c1032c = null;
        for (int i11 = 0; i11 < size; i11++) {
            C1032c c1032c2 = this.f82784c.get(i11);
            int i12 = c1032c2.f82795b;
            if (i12 > i10) {
                c1032c = c1032c2;
                i10 = i12;
            }
        }
        return c1032c;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.w.c.a():void");
    }
}
