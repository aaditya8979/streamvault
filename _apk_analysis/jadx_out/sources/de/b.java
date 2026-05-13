package de;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.media.SoundPool;
import android.text.BoringLayout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import be.e;
import bo.a0;
import cn.w;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.opensource.svgaplayer.SVGAVideoEntity;
import com.opensource.svgaplayer.entities.SVGAVideoShapeEntity;
import de.a;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import org.jetbrains.annotations.NotNull;
import sn.r;
import tn.p;

/* JADX INFO: compiled from: SVGACanvasDrawer.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002\t>B\u0017\u0012\u0006\u0010;\u001a\u00020:\u0012\u0006\u00109\u001a\u000205¢\u0006\u0004\b<\u0010=J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\"\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00042\u0010\u0010\r\u001a\f\u0012\b\u0012\u00060\fR\u00020\u00010\u000bH\u0002J\"\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00042\u0010\u0010\r\u001a\f\u0012\b\u0012\u00060\fR\u00020\u00010\u000bH\u0002J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J$\u0010\u0016\u001a\u00020\b2\n\u0010\u0015\u001a\u00060\fR\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001c\u0010\u0017\u001a\u00020\b2\n\u0010\u0015\u001a\u00060\fR\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J,\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\n\u0010\u0015\u001a\u00060\fR\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0012H\u0002J\u001c\u0010\u001c\u001a\u00020\b2\n\u0010\u0015\u001a\u00060\fR\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0012H\u0002J$\u0010 \u001a\u00020\b2\n\u0010\u0015\u001a\u00060\fR\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R0\u0010*\u001a\u001e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00180%j\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0018`'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010,R\u001e\u00100\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010/R\u001e\u00101\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010/R\u0014\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00103R\u0017\u00109\u001a\u0002058\u0006¢\u0006\f\n\u0004\b\u001b\u00106\u001a\u0004\b7\u00108¨\u0006?"}, d2 = {"Lde/b;", "Lde/a;", "Landroid/graphics/Canvas;", "canvas", "", "frameIndex", "Landroid/widget/ImageView$ScaleType;", "scaleType", "Lbn/r;", "a", "spriteIndex", "", "Lde/a$a;", "sprites", "", "j", CampaignEx.JSON_KEY_AD_K, InneractiveMediationDefs.GENDER_MALE, "Landroid/graphics/Matrix;", "transform", "n", "sprite", "h", InneractiveMediationDefs.GENDER_FEMALE, "Landroid/graphics/Bitmap;", "drawingBitmap", "frameMatrix", "i", "g", "matrix", "", "l", "e", "Lde/b$b;", "c", "Lde/b$b;", "sharedValues", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "d", "Ljava/util/HashMap;", "drawTextCache", "Lde/b$a;", "Lde/b$a;", "pathCache", "", "[Ljava/lang/Boolean;", "beginIndexList", "endIndexList", "", "[F", "matrixScaleTempValues", "Lbe/e;", "Lbe/e;", "getDynamicItem", "()Lbe/e;", "dynamicItem", "Lcom/opensource/svgaplayer/SVGAVideoEntity;", "videoItem", "<init>", "(Lcom/opensource/svgaplayer/SVGAVideoEntity;Lbe/e;)V", "b", "com.opensource.svgaplayer"}, k = 1, mv = {1, 4, 0})
public final class b extends de.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final C0734b sharedValues;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final HashMap<String, Bitmap> drawTextCache;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final a pathCache;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public Boolean[] beginIndexList;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public Boolean[] endIndexList;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final float[] matrixScaleTempValues;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e dynamicItem;

    /* JADX INFO: compiled from: SVGACanvasDrawer.kt */
    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR0\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u000ej\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b`\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lde/b$a;", "", "Landroid/graphics/Canvas;", "canvas", "Lbn/r;", "b", "Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity;", "shape", "Landroid/graphics/Path;", "a", "", "I", "canvasWidth", "canvasHeight", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "c", "Ljava/util/HashMap;", "cache", "<init>", "()V", "com.opensource.svgaplayer"}, k = 1, mv = {1, 4, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public int canvasWidth;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public int canvasHeight;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final HashMap<SVGAVideoShapeEntity, Path> cache = new HashMap<>();

        @NotNull
        public final Path a(@NotNull SVGAVideoShapeEntity shape) {
            p.l(shape, "shape");
            if (!this.cache.containsKey(shape)) {
                Path path = new Path();
                path.set(shape.getShapePath());
                this.cache.put(shape, path);
            }
            Path path2 = this.cache.get(shape);
            if (path2 == null) {
                p.w();
            }
            return path2;
        }

        public final void b(@NotNull Canvas canvas) {
            p.l(canvas, "canvas");
            if (this.canvasWidth != canvas.getWidth() || this.canvasHeight != canvas.getHeight()) {
                this.cache.clear();
            }
            this.canvasWidth = canvas.getWidth();
            this.canvasHeight = canvas.getHeight();
        }
    }

    /* JADX INFO: renamed from: de.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SVGACanvasDrawer.kt */
    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\u0002J\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rR\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001d¨\u0006!"}, d2 = {"Lde/b$b;", "", "Landroid/graphics/Paint;", InneractiveMediationDefs.GENDER_FEMALE, "Landroid/graphics/Path;", "g", "h", "Landroid/graphics/Matrix;", "c", "d", "b", "Landroid/graphics/Bitmap;", "e", "", "width", "height", "Landroid/graphics/Canvas;", "a", "Landroid/graphics/Paint;", "sharedPaint", "Landroid/graphics/Path;", "sharedPath", "sharedPath2", "Landroid/graphics/Matrix;", "sharedMatrix", "sharedMatrix2", "shareMattePaint", "Landroid/graphics/Canvas;", "shareMatteCanvas", "Landroid/graphics/Bitmap;", "sharedMatteBitmap", "<init>", "()V", "com.opensource.svgaplayer"}, k = 1, mv = {1, 4, 0})
    public static final class C0734b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final Paint sharedPaint = new Paint();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final Path sharedPath = new Path();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final Path sharedPath2 = new Path();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final Matrix sharedMatrix = new Matrix();

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public final Matrix sharedMatrix2 = new Matrix();

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public final Paint shareMattePaint = new Paint();

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public Canvas shareMatteCanvas;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        public Bitmap sharedMatteBitmap;

        @NotNull
        public final Canvas a(int width, int height) {
            if (this.shareMatteCanvas == null) {
                this.sharedMatteBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ALPHA_8);
            }
            return new Canvas(this.sharedMatteBitmap);
        }

        @NotNull
        public final Paint b() {
            this.shareMattePaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            return this.shareMattePaint;
        }

        @NotNull
        public final Matrix c() {
            this.sharedMatrix.reset();
            return this.sharedMatrix;
        }

        @NotNull
        public final Matrix d() {
            this.sharedMatrix2.reset();
            return this.sharedMatrix2;
        }

        @NotNull
        public final Bitmap e() {
            Bitmap bitmap = this.sharedMatteBitmap;
            if (bitmap != null) {
                return bitmap;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.graphics.Bitmap");
        }

        @NotNull
        public final Paint f() {
            this.sharedPaint.reset();
            return this.sharedPaint;
        }

        @NotNull
        public final Path g() {
            this.sharedPath.reset();
            return this.sharedPath;
        }

        @NotNull
        public final Path h() {
            this.sharedPath2.reset();
            return this.sharedPath2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull SVGAVideoEntity sVGAVideoEntity, @NotNull e eVar) {
        super(sVGAVideoEntity);
        p.l(sVGAVideoEntity, "videoItem");
        p.l(eVar, "dynamicItem");
        this.dynamicItem = eVar;
        this.sharedValues = new C0734b();
        this.drawTextCache = new HashMap<>();
        this.pathCache = new a();
        this.matrixScaleTempValues = new float[16];
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    @Override // de.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(@org.jetbrains.annotations.NotNull android.graphics.Canvas r21, int r22, @org.jetbrains.annotations.NotNull android.widget.ImageView.ScaleType r23) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: de.b.a(android.graphics.Canvas, int, android.widget.ImageView$ScaleType):void");
    }

    public final void e(a.C0733a c0733a, Canvas canvas, int i10) {
        String imageKey = c0733a.getImageKey();
        if (imageKey != null) {
            sn.p<Canvas, Integer, Boolean> pVar = this.dynamicItem.b().get(imageKey);
            if (pVar != null) {
                Matrix matrixN = n(c0733a.getFrameEntity().getTransform());
                canvas.save();
                canvas.concat(matrixN);
                pVar.mo2invoke(canvas, Integer.valueOf(i10));
                canvas.restore();
            }
            r<Canvas, Integer, Integer, Integer, Boolean> rVar = this.dynamicItem.c().get(imageKey);
            if (rVar != null) {
                Matrix matrixN2 = n(c0733a.getFrameEntity().getTransform());
                canvas.save();
                canvas.concat(matrixN2);
                rVar.invoke(canvas, Integer.valueOf(i10), Integer.valueOf((int) c0733a.getFrameEntity().getLayout().getWidth()), Integer.valueOf((int) c0733a.getFrameEntity().getLayout().getHeight()));
                canvas.restore();
            }
        }
    }

    public final void f(a.C0733a c0733a, Canvas canvas) {
        String imageKey = c0733a.getImageKey();
        if (imageKey == null || p.f(this.dynamicItem.d().get(imageKey), Boolean.TRUE)) {
            return;
        }
        String strS = a0.S(imageKey, ".matte", "", false, 4, null);
        Bitmap bitmap = this.dynamicItem.f().get(strS);
        if (bitmap == null) {
            bitmap = getVideoItem().n().get(strS);
        }
        Bitmap bitmap2 = bitmap;
        if (bitmap2 != null) {
            Matrix matrixN = n(c0733a.getFrameEntity().getTransform());
            Paint paintF = this.sharedValues.f();
            paintF.setAntiAlias(getVideoItem().getAntiAlias());
            paintF.setFilterBitmap(getVideoItem().getAntiAlias());
            paintF.setAlpha((int) (c0733a.getFrameEntity().getAlpha() * ((double) 255)));
            if (c0733a.getFrameEntity().getMaskPath() != null) {
                ee.b maskPath = c0733a.getFrameEntity().getMaskPath();
                if (maskPath == null) {
                    return;
                }
                canvas.save();
                Path pathG = this.sharedValues.g();
                maskPath.a(pathG);
                pathG.transform(matrixN);
                canvas.clipPath(pathG);
                matrixN.preScale((float) (c0733a.getFrameEntity().getLayout().getWidth() / ((double) bitmap2.getWidth())), (float) (c0733a.getFrameEntity().getLayout().getWidth() / ((double) bitmap2.getWidth())));
                if (!bitmap2.isRecycled()) {
                    canvas.drawBitmap(bitmap2, matrixN, paintF);
                }
                canvas.restore();
            } else {
                matrixN.preScale((float) (c0733a.getFrameEntity().getLayout().getWidth() / ((double) bitmap2.getWidth())), (float) (c0733a.getFrameEntity().getLayout().getWidth() / ((double) bitmap2.getWidth())));
                if (!bitmap2.isRecycled()) {
                    canvas.drawBitmap(bitmap2, matrixN, paintF);
                }
            }
            be.a aVar = this.dynamicItem.e().get(imageKey);
            if (aVar != null) {
                float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
                matrixN.getValues(fArr);
                aVar.a(imageKey, (int) fArr[2], (int) fArr[5], (int) ((bitmap2.getWidth() * fArr[0]) + fArr[2]), (int) ((bitmap2.getHeight() * fArr[4]) + fArr[5]));
            }
            i(canvas, bitmap2, c0733a, matrixN);
        }
    }

    public final void g(a.C0733a c0733a, Canvas canvas) {
        float[] lineDash;
        String lineJoin;
        String lineCap;
        int i10;
        Matrix matrixN = n(c0733a.getFrameEntity().getTransform());
        for (SVGAVideoShapeEntity sVGAVideoShapeEntity : c0733a.getFrameEntity().d()) {
            sVGAVideoShapeEntity.a();
            if (sVGAVideoShapeEntity.getShapePath() != null) {
                Paint paintF = this.sharedValues.f();
                paintF.reset();
                paintF.setAntiAlias(getVideoItem().getAntiAlias());
                double d10 = 255;
                paintF.setAlpha((int) (c0733a.getFrameEntity().getAlpha() * d10));
                Path pathG = this.sharedValues.g();
                pathG.reset();
                pathG.addPath(this.pathCache.a(sVGAVideoShapeEntity));
                Matrix matrixD = this.sharedValues.d();
                matrixD.reset();
                Matrix transform = sVGAVideoShapeEntity.getTransform();
                if (transform != null) {
                    matrixD.postConcat(transform);
                }
                matrixD.postConcat(matrixN);
                pathG.transform(matrixD);
                SVGAVideoShapeEntity.a styles = sVGAVideoShapeEntity.getStyles();
                if (styles != null && (i10 = styles.getIo.bidmachine.iab.vast.tags.VastAttributes.FILL_COLOR java.lang.String()) != 0) {
                    paintF.setStyle(Paint.Style.FILL);
                    paintF.setColor(i10);
                    paintF.setAlpha(Math.min(255, Math.max(0, (int) (c0733a.getFrameEntity().getAlpha() * d10))));
                    if (c0733a.getFrameEntity().getMaskPath() != null) {
                        canvas.save();
                    }
                    ee.b maskPath = c0733a.getFrameEntity().getMaskPath();
                    if (maskPath != null) {
                        Path pathH = this.sharedValues.h();
                        maskPath.a(pathH);
                        pathH.transform(matrixN);
                        canvas.clipPath(pathH);
                    }
                    canvas.drawPath(pathG, paintF);
                    if (c0733a.getFrameEntity().getMaskPath() != null) {
                        canvas.restore();
                    }
                }
                SVGAVideoShapeEntity.a styles2 = sVGAVideoShapeEntity.getStyles();
                if (styles2 != null) {
                    float f10 = 0;
                    if (styles2.getStrokeWidth() > f10) {
                        paintF.setStyle(Paint.Style.STROKE);
                        SVGAVideoShapeEntity.a styles3 = sVGAVideoShapeEntity.getStyles();
                        if (styles3 != null) {
                            paintF.setColor(styles3.getIo.bidmachine.iab.vast.tags.VastAttributes.STROKE_COLOR java.lang.String());
                            paintF.setAlpha(Math.min(255, Math.max(0, (int) (c0733a.getFrameEntity().getAlpha() * d10))));
                        }
                        float fL = l(matrixN);
                        SVGAVideoShapeEntity.a styles4 = sVGAVideoShapeEntity.getStyles();
                        if (styles4 != null) {
                            paintF.setStrokeWidth(styles4.getStrokeWidth() * fL);
                        }
                        SVGAVideoShapeEntity.a styles5 = sVGAVideoShapeEntity.getStyles();
                        if (styles5 != null && (lineCap = styles5.getLineCap()) != null) {
                            if (a0.J(lineCap, "butt", true)) {
                                paintF.setStrokeCap(Paint.Cap.BUTT);
                            } else if (a0.J(lineCap, "round", true)) {
                                paintF.setStrokeCap(Paint.Cap.ROUND);
                            } else if (a0.J(lineCap, "square", true)) {
                                paintF.setStrokeCap(Paint.Cap.SQUARE);
                            }
                        }
                        SVGAVideoShapeEntity.a styles6 = sVGAVideoShapeEntity.getStyles();
                        if (styles6 != null && (lineJoin = styles6.getLineJoin()) != null) {
                            if (a0.J(lineJoin, "miter", true)) {
                                paintF.setStrokeJoin(Paint.Join.MITER);
                            } else if (a0.J(lineJoin, "round", true)) {
                                paintF.setStrokeJoin(Paint.Join.ROUND);
                            } else if (a0.J(lineJoin, "bevel", true)) {
                                paintF.setStrokeJoin(Paint.Join.BEVEL);
                            }
                        }
                        if (sVGAVideoShapeEntity.getStyles() != null) {
                            paintF.setStrokeMiter(r8.getMiterLimit() * fL);
                        }
                        SVGAVideoShapeEntity.a styles7 = sVGAVideoShapeEntity.getStyles();
                        if (styles7 != null && (lineDash = styles7.getLineDash()) != null && lineDash.length == 3 && (lineDash[0] > f10 || lineDash[1] > f10)) {
                            float[] fArr = new float[2];
                            float f11 = lineDash[0];
                            if (f11 < 1.0f) {
                                f11 = 1.0f;
                            }
                            fArr[0] = f11 * fL;
                            float f12 = lineDash[1];
                            if (f12 < 0.1f) {
                                f12 = 0.1f;
                            }
                            fArr[1] = f12 * fL;
                            paintF.setPathEffect(new DashPathEffect(fArr, lineDash[2] * fL));
                        }
                        if (c0733a.getFrameEntity().getMaskPath() != null) {
                            canvas.save();
                        }
                        ee.b maskPath2 = c0733a.getFrameEntity().getMaskPath();
                        if (maskPath2 != null) {
                            Path pathH2 = this.sharedValues.h();
                            maskPath2.a(pathH2);
                            pathH2.transform(matrixN);
                            canvas.clipPath(pathH2);
                        }
                        canvas.drawPath(pathG, paintF);
                        if (c0733a.getFrameEntity().getMaskPath() != null) {
                            canvas.restore();
                        }
                    }
                }
            }
        }
    }

    public final void h(a.C0733a c0733a, Canvas canvas, int i10) {
        f(c0733a, canvas);
        g(c0733a, canvas);
        e(c0733a, canvas, i10);
    }

    public final void i(Canvas canvas, Bitmap bitmap, a.C0733a c0733a, Matrix matrix) {
        int i10;
        TextPaint textPaint;
        if (this.dynamicItem.getIsTextDirty()) {
            this.drawTextCache.clear();
            this.dynamicItem.l(false);
        }
        String imageKey = c0733a.getImageKey();
        if (imageKey != null) {
            Bitmap bitmapCreateBitmap = null;
            String str = this.dynamicItem.h().get(imageKey);
            if (str != null && (textPaint = this.dynamicItem.i().get(imageKey)) != null && (bitmapCreateBitmap = this.drawTextCache.get(imageKey)) == null) {
                bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                p.g(textPaint, "drawingTextPaint");
                textPaint.setAntiAlias(true);
                textPaint.setStyle(Paint.Style.FILL);
                textPaint.setTextAlign(Paint.Align.CENTER);
                Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
                float f10 = 2;
                canvas2.drawText(str, rect.centerX(), (rect.centerY() - (fontMetrics.top / f10)) - (fontMetrics.bottom / f10), textPaint);
                HashMap<String, Bitmap> map = this.drawTextCache;
                if (bitmapCreateBitmap == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.graphics.Bitmap");
                }
                map.put(imageKey, bitmapCreateBitmap);
            }
            BoringLayout boringLayout = this.dynamicItem.a().get(imageKey);
            if (boringLayout != null && (bitmapCreateBitmap = this.drawTextCache.get(imageKey)) == null) {
                p.g(boringLayout, "it");
                TextPaint paint = boringLayout.getPaint();
                p.g(paint, "it.paint");
                paint.setAntiAlias(true);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas3 = new Canvas(bitmapCreateBitmap);
                canvas3.translate(0.0f, (bitmap.getHeight() - boringLayout.getHeight()) / 2);
                boringLayout.draw(canvas3);
                HashMap<String, Bitmap> map2 = this.drawTextCache;
                if (bitmapCreateBitmap == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.graphics.Bitmap");
                }
                map2.put(imageKey, bitmapCreateBitmap);
            }
            StaticLayout staticLayout = this.dynamicItem.g().get(imageKey);
            if (staticLayout != null && (bitmapCreateBitmap = this.drawTextCache.get(imageKey)) == null) {
                p.g(staticLayout, "it");
                TextPaint paint2 = staticLayout.getPaint();
                p.g(paint2, "it.paint");
                paint2.setAntiAlias(true);
                try {
                    Field declaredField = StaticLayout.class.getDeclaredField("mMaximumVisibleLineCount");
                    p.g(declaredField, "field");
                    declaredField.setAccessible(true);
                    i10 = declaredField.getInt(staticLayout);
                } catch (Exception unused) {
                    i10 = Integer.MAX_VALUE;
                }
                StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(staticLayout.getText(), 0, staticLayout.getText().length(), staticLayout.getPaint(), bitmap.getWidth()).setAlignment(staticLayout.getAlignment()).setMaxLines(i10).setEllipsize(TextUtils.TruncateAt.END).build();
                bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas4 = new Canvas(bitmapCreateBitmap);
                int height = bitmap.getHeight();
                p.g(staticLayoutBuild, "layout");
                canvas4.translate(0.0f, (height - staticLayoutBuild.getHeight()) / 2);
                staticLayoutBuild.draw(canvas4);
                HashMap<String, Bitmap> map3 = this.drawTextCache;
                if (bitmapCreateBitmap == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.graphics.Bitmap");
                }
                map3.put(imageKey, bitmapCreateBitmap);
            }
            if (bitmapCreateBitmap != null) {
                Paint paintF = this.sharedValues.f();
                paintF.setAntiAlias(getVideoItem().getAntiAlias());
                paintF.setAlpha((int) (c0733a.getFrameEntity().getAlpha() * ((double) 255)));
                if (c0733a.getFrameEntity().getMaskPath() == null) {
                    paintF.setFilterBitmap(getVideoItem().getAntiAlias());
                    canvas.drawBitmap(bitmapCreateBitmap, matrix, paintF);
                    return;
                }
                ee.b maskPath = c0733a.getFrameEntity().getMaskPath();
                if (maskPath != null) {
                    canvas.save();
                    canvas.concat(matrix);
                    canvas.clipRect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                    Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                    paintF.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
                    Path pathG = this.sharedValues.g();
                    maskPath.a(pathG);
                    canvas.drawPath(pathG, paintF);
                    canvas.restore();
                }
            }
        }
    }

    public final boolean j(int spriteIndex, List<a.C0733a> sprites) {
        Boolean bool;
        String matteKey;
        a.C0733a c0733a;
        if (this.beginIndexList == null) {
            int size = sprites.size();
            Boolean[] boolArr = new Boolean[size];
            for (int i10 = 0; i10 < size; i10++) {
                boolArr[i10] = Boolean.FALSE;
            }
            int i11 = 0;
            for (Object obj : sprites) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    w.w();
                }
                a.C0733a c0733a2 = (a.C0733a) obj;
                String imageKey = c0733a2.getImageKey();
                if ((imageKey == null || !a0.I(imageKey, ".matte", false, 2, null)) && (matteKey = c0733a2.getMatteKey()) != null && matteKey.length() > 0 && (c0733a = sprites.get(i11 - 1)) != null) {
                    if (c0733a.getMatteKey() == null || c0733a.getMatteKey().length() == 0) {
                        boolArr[i11] = Boolean.TRUE;
                    } else if (!p.f(c0733a.getMatteKey(), c0733a2.getMatteKey())) {
                        boolArr[i11] = Boolean.TRUE;
                    }
                }
                i11 = i12;
            }
            this.beginIndexList = boolArr;
        }
        Boolean[] boolArr2 = this.beginIndexList;
        if (boolArr2 == null || (bool = boolArr2[spriteIndex]) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean k(int spriteIndex, List<a.C0733a> sprites) {
        Boolean bool;
        String matteKey;
        if (this.endIndexList == null) {
            int size = sprites.size();
            Boolean[] boolArr = new Boolean[size];
            for (int i10 = 0; i10 < size; i10++) {
                boolArr[i10] = Boolean.FALSE;
            }
            int i11 = 0;
            for (Object obj : sprites) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    w.w();
                }
                a.C0733a c0733a = (a.C0733a) obj;
                String imageKey = c0733a.getImageKey();
                if ((imageKey == null || !a0.I(imageKey, ".matte", false, 2, null)) && (matteKey = c0733a.getMatteKey()) != null && matteKey.length() > 0) {
                    if (i11 == sprites.size() - 1) {
                        boolArr[i11] = Boolean.TRUE;
                    } else {
                        a.C0733a c0733a2 = sprites.get(i12);
                        if (c0733a2 != null) {
                            if (c0733a2.getMatteKey() == null || c0733a2.getMatteKey().length() == 0) {
                                boolArr[i11] = Boolean.TRUE;
                            } else if (!p.f(c0733a2.getMatteKey(), c0733a.getMatteKey())) {
                                boolArr[i11] = Boolean.TRUE;
                            }
                        }
                    }
                }
                i11 = i12;
            }
            this.endIndexList = boolArr;
        }
        Boolean[] boolArr2 = this.endIndexList;
        if (boolArr2 == null || (bool = boolArr2[spriteIndex]) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final float l(Matrix matrix) {
        matrix.getValues(this.matrixScaleTempValues);
        float[] fArr = this.matrixScaleTempValues;
        float f10 = fArr[0];
        if (f10 == 0.0f) {
            return 0.0f;
        }
        double d10 = f10;
        double d11 = fArr[3];
        double d12 = fArr[1];
        double d13 = fArr[4];
        if (d10 * d13 == d11 * d12) {
            return 0.0f;
        }
        double dSqrt = Math.sqrt((d10 * d10) + (d11 * d11));
        double d14 = d10 / dSqrt;
        double d15 = d11 / dSqrt;
        double d16 = (d14 * d12) + (d15 * d13);
        double d17 = d12 - (d14 * d16);
        double d18 = d13 - (d16 * d15);
        double dSqrt2 = Math.sqrt((d17 * d17) + (d18 * d18));
        if (d14 * (d18 / dSqrt2) < d15 * (d17 / dSqrt2)) {
            dSqrt = -dSqrt;
        }
        return Math.abs(getScaleInfo().getRatioX() ? (float) dSqrt : (float) dSqrt2);
    }

    public final void m(int i10) {
        SoundPool soundPool;
        Integer soundID;
        for (ee.a aVar : getVideoItem().k()) {
            if (aVar.getStartFrame() == i10 && (soundPool = getVideoItem().getSoundPool()) != null && (soundID = aVar.getSoundID()) != null) {
                aVar.e(Integer.valueOf(soundPool.play(soundID.intValue(), 1.0f, 1.0f, 1, 0, 1.0f)));
            }
            if (aVar.getEndFrame() <= i10) {
                Integer playID = aVar.getPlayID();
                if (playID != null) {
                    int iIntValue = playID.intValue();
                    SoundPool soundPool2 = getVideoItem().getSoundPool();
                    if (soundPool2 != null) {
                        soundPool2.stop(iIntValue);
                    }
                }
                aVar.e(null);
            }
        }
    }

    public final Matrix n(Matrix transform) {
        Matrix matrixC = this.sharedValues.c();
        matrixC.postScale(getScaleInfo().getScaleFx(), getScaleInfo().getScaleFy());
        matrixC.postTranslate(getScaleInfo().getTranFx(), getScaleInfo().getTranFy());
        matrixC.preConcat(transform);
        return matrixC;
    }
}
