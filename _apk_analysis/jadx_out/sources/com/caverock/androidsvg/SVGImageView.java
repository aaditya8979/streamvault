package com.caverock.androidsvg;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes5.dex */
public class SVGImageView extends ImageView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f14841d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SVG f14842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.caverock.androidsvg.a f14843c;

    public class b extends AsyncTask<Integer, Integer, SVG> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f14844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14845b;

        public b(Context context, int i10) {
            this.f14844a = context;
            this.f14845b = i10;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SVG doInBackground(Integer... numArr) {
            try {
                return SVG.m(this.f14844a, this.f14845b);
            } catch (SVGParseException e10) {
                Log.e("SVGImageView", String.format("Error loading resource 0x%x: %s", Integer.valueOf(this.f14845b), e10.getMessage()));
                return null;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(SVG svg) {
            SVGImageView.this.f14842b = svg;
            SVGImageView.this.c();
        }
    }

    public class c extends AsyncTask<InputStream, Integer, SVG> {
        public c() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SVG doInBackground(InputStream... inputStreamArr) {
            try {
                try {
                    return SVG.l(inputStreamArr[0]);
                } catch (SVGParseException e10) {
                    Log.e("SVGImageView", "Parse error loading URI: " + e10.getMessage());
                    try {
                        inputStreamArr[0].close();
                        return null;
                    } catch (IOException unused) {
                        return null;
                    }
                }
            } finally {
                try {
                    inputStreamArr[0].close();
                } catch (IOException unused2) {
                }
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(SVG svg) {
            SVGImageView.this.f14842b = svg;
            SVGImageView.this.c();
        }
    }

    static {
        try {
            f14841d = View.class.getMethod("setLayerType", Integer.TYPE, Paint.class);
        } catch (NoSuchMethodException unused) {
        }
    }

    public SVGImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f14842b = null;
        this.f14843c = new com.caverock.androidsvg.a();
        d(attributeSet, 0);
    }

    public SVGImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f14842b = null;
        this.f14843c = new com.caverock.androidsvg.a();
        d(attributeSet, i10);
    }

    private void setFromString(String str) {
        try {
            this.f14842b = SVG.o(str);
            c();
        } catch (SVGParseException unused) {
            Log.e("SVGImageView", "Could not find SVG at: " + str);
        }
    }

    public final void c() {
        SVG svg = this.f14842b;
        if (svg == null) {
            return;
        }
        Picture pictureT = svg.t(this.f14843c);
        g();
        setImageDrawable(new PictureDrawable(pictureT));
    }

    public final void d(AttributeSet attributeSet, int i10) {
        if (isInEditMode()) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, R$styleable.SVGImageView, i10, 0);
        try {
            String string = typedArrayObtainStyledAttributes.getString(R$styleable.SVGImageView_css);
            if (string != null) {
                this.f14843c.a(string);
            }
            int i11 = R$styleable.SVGImageView_svg;
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(i11, -1);
            if (resourceId != -1) {
                setImageResource(resourceId);
                return;
            }
            String string2 = typedArrayObtainStyledAttributes.getString(i11);
            if (string2 != null) {
                if (f(Uri.parse(string2))) {
                    return;
                }
                if (e(string2)) {
                } else {
                    setFromString(string2);
                }
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch("com.caverock.androidsvg", this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean e(String str) {
        try {
            new c().execute(getContext().getAssets().open(str));
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public final boolean f(Uri uri) {
        try {
            new c().execute(getContext().getContentResolver().openInputStream(uri));
            return true;
        } catch (FileNotFoundException unused) {
            return false;
        }
    }

    public final void g() {
        if (f14841d == null) {
            return;
        }
        try {
            f14841d.invoke(this, Integer.valueOf(View.class.getField("LAYER_TYPE_SOFTWARE").getInt(new View(getContext()))), null);
        } catch (Exception e10) {
            Log.w("SVGImageView", "Unexpected failure calling setLayerType", e10);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setCSS(String str) {
        this.f14843c.a(str);
        c();
    }

    public void setImageAsset(String str) {
        if (e(str)) {
            return;
        }
        Log.e("SVGImageView", "File not found: " + str);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        new b(getContext(), i10).execute(new Integer[0]);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        if (f(uri)) {
            return;
        }
        Log.e("SVGImageView", "File not found: " + uri);
    }

    public void setSVG(SVG svg) {
        if (svg == null) {
            throw new IllegalArgumentException("Null value passed to setSVG()");
        }
        this.f14842b = svg;
        c();
    }
}
