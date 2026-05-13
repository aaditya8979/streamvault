package yads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes9.dex */
public final class o41 extends po2 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Object f93114y = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f93115s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public up2 f93116t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Bitmap.Config f93117u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f93118v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f93119w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ImageView.ScaleType f93120x;

    public o41(String str, d41 d41Var, int i10, int i11, ImageView.ScaleType scaleType, Bitmap.Config config, e41 e41Var) {
        super(0, str, e41Var);
        this.f93115s = new Object();
        a(new qe0(2.0f, 1000, 2));
        this.f93116t = d41Var;
        this.f93117u = config;
        this.f93118v = i10;
        this.f93119w = i11;
        this.f93120x = scaleType;
    }

    public static int a(int i10, int i11, int i12, int i13, ImageView.ScaleType scaleType) {
        if (i10 == 0 && i11 == 0) {
            return i12;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            return i10 == 0 ? i12 : i10;
        }
        if (i10 == 0) {
            return (int) (((double) i12) * (((double) i11) / ((double) i13)));
        }
        if (i11 == 0) {
            return i10;
        }
        double d10 = ((double) i13) / ((double) i12);
        if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            double d11 = i11;
            return ((double) i10) * d10 < d11 ? (int) (d11 / d10) : i10;
        }
        double d12 = i11;
        return ((double) i10) * d10 > d12 ? (int) (d12 / d10) : i10;
    }

    @Override // yads.po2
    public final vp2 a(e82 e82Var) {
        vp2 vp2VarB;
        synchronized (f93114y) {
            try {
                try {
                    vp2VarB = b(e82Var);
                } catch (OutOfMemoryError e10) {
                    int length = e82Var.f89158b.length;
                    boolean z10 = lm3.f92036a;
                    boolean z11 = ad1.f87661a;
                    return new vp2(new mb2(e10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return vp2VarB;
    }

    @Override // yads.po2
    public final void a() {
        super.a();
        synchronized (this.f93115s) {
            this.f93116t = null;
        }
    }

    @Override // yads.po2
    public final void a(Object obj) {
        up2 up2Var;
        Bitmap bitmap = (Bitmap) obj;
        synchronized (this.f93115s) {
            up2Var = this.f93116t;
        }
        if (up2Var != null) {
            up2Var.a(bitmap);
        }
    }

    public final vp2 b(e82 e82Var) {
        Bitmap bitmapDecodeByteArray;
        byte[] bArr = e82Var.f89158b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.f93118v == 0 && this.f93119w == 0) {
            options.inPreferredConfig = this.f93117u;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i10 = options.outWidth;
            int i11 = options.outHeight;
            int iA = a(this.f93118v, this.f93119w, i10, i11, this.f93120x);
            int iA2 = a(this.f93119w, this.f93118v, i11, i10, this.f93120x);
            options.inJustDecodeBounds = false;
            float f10 = 1.0f;
            while (true) {
                float f11 = 2.0f * f10;
                if (f11 > Math.min(((double) i10) / ((double) iA), ((double) i11) / ((double) iA2))) {
                    break;
                }
                f10 = f11;
            }
            options.inSampleSize = (int) f10;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (bitmapDecodeByteArray != null && (bitmapDecodeByteArray.getWidth() > iA || bitmapDecodeByteArray.getHeight() > iA2)) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeByteArray, iA, iA2, true);
                bitmapDecodeByteArray.recycle();
                bitmapDecodeByteArray = bitmapCreateScaledBitmap;
            }
        }
        return bitmapDecodeByteArray == null ? new vp2(new mb2(e82Var)) : new vp2(bitmapDecodeByteArray, v11.a(e82Var));
    }

    @Override // yads.po2
    public final int f() {
        return 1;
    }
}
