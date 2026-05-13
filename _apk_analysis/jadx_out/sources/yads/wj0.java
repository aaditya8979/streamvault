package yads;

/* JADX INFO: loaded from: classes6.dex */
public final class wj0 implements eq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final os2 f96400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iq f96401b;

    public wj0(os2 os2Var, iq iqVar) {
        this.f96400a = os2Var;
        this.f96401b = iqVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // yads.eq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.graphics.drawable.Drawable r9, android.graphics.Bitmap r10) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof android.graphics.drawable.BitmapDrawable
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L14
            r0 = r9
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r3 = r0.getBitmap()
            if (r3 == 0) goto L14
            android.graphics.Bitmap r9 = r0.getBitmap()
            goto L51
        L14:
            yads.os2 r0 = r8.f96400a
            r0.getClass()
            int r3 = r9.getIntrinsicWidth()
            int r4 = r9.getIntrinsicHeight()
            if (r3 <= 0) goto L32
            if (r4 > 0) goto L26
            goto L32
        L26:
            yads.iq r0 = r0.f93320a
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
            r0.getClass()
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r3, r4, r5)
            goto L3d
        L32:
            yads.iq r0 = r0.f93320a
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            r0.getClass()
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r2, r3)
        L3d:
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r0)
            int r4 = r3.getWidth()
            int r5 = r3.getHeight()
            r9.setBounds(r1, r1, r4, r5)
            r9.draw(r3)
            r9 = r0
        L51:
            yads.iq r0 = r8.f96401b
            r0.getClass()
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createScaledBitmap(r9, r2, r2, r2)
            yads.iq r0 = r8.f96401b
            r0.getClass()
            android.graphics.Bitmap r10 = android.graphics.Bitmap.createScaledBitmap(r10, r2, r2, r2)
            int r9 = r9.getPixel(r1, r1)
            int r0 = android.graphics.Color.alpha(r9)
            int r3 = android.graphics.Color.red(r9)
            int r4 = android.graphics.Color.green(r9)
            int r9 = android.graphics.Color.blue(r9)
            int r10 = r10.getPixel(r1, r1)
            int r5 = android.graphics.Color.alpha(r10)
            int r6 = android.graphics.Color.red(r10)
            int r7 = android.graphics.Color.green(r10)
            int r10 = android.graphics.Color.blue(r10)
            int r0 = r0 - r5
            int r0 = java.lang.Math.abs(r0)
            r5 = 20
            if (r0 <= r5) goto L95
            goto Lad
        L95:
            int r3 = r3 - r6
            int r0 = java.lang.Math.abs(r3)
            if (r0 <= r5) goto L9d
            goto Lad
        L9d:
            int r4 = r4 - r7
            int r0 = java.lang.Math.abs(r4)
            if (r0 <= r5) goto La5
            goto Lad
        La5:
            int r9 = r9 - r10
            int r9 = java.lang.Math.abs(r9)
            if (r9 > r5) goto Lad
            r1 = r2
        Lad:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.wj0.a(android.graphics.drawable.Drawable, android.graphics.Bitmap):boolean");
    }
}
