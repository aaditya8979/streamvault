package de;

import android.graphics.Canvas;
import android.widget.ImageView;
import bo.a0;
import com.opensource.svgaplayer.SVGAVideoEntity;
import ee.f;
import ee.g;
import fe.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: SGVADrawer.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u0005R\u00020\u00000\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lde/a;", "", "", "frameIndex", "", "Lde/a$a;", "d", "(I)Ljava/util/List;", "Landroid/graphics/Canvas;", "canvas", "Landroid/widget/ImageView$ScaleType;", "scaleType", "Lbn/r;", "a", "Lfe/e;", "Lfe/e;", "b", "()Lfe/e;", "scaleInfo", "Lcom/opensource/svgaplayer/SVGAVideoEntity;", "Lcom/opensource/svgaplayer/SVGAVideoEntity;", "c", "()Lcom/opensource/svgaplayer/SVGAVideoEntity;", "videoItem", "<init>", "(Lcom/opensource/svgaplayer/SVGAVideoEntity;)V", "com.opensource.svgaplayer"}, k = 1, mv = {1, 4, 0})
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e scaleInfo;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SVGAVideoEntity videoItem;

    /* JADX INFO: renamed from: de.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SGVADrawer.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u0003\u0010\f¨\u0006\u0010"}, d2 = {"Lde/a$a;", "", "", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "matteKey", "b", "imageKey", "Lee/g;", "Lee/g;", "()Lee/g;", "frameEntity", "<init>", "(Lde/a;Ljava/lang/String;Ljava/lang/String;Lee/g;)V", "com.opensource.svgaplayer"}, k = 1, mv = {1, 4, 0})
    public final class C0733a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String matteKey;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String imageKey;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final g frameEntity;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a f59748d;

        public C0733a(@Nullable a aVar, @Nullable String str, @NotNull String str2, g gVar) {
            p.l(gVar, "frameEntity");
            this.f59748d = aVar;
            this.matteKey = str;
            this.imageKey = str2;
            this.frameEntity = gVar;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final g getFrameEntity() {
            return this.frameEntity;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getImageKey() {
            return this.imageKey;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getMatteKey() {
            return this.matteKey;
        }
    }

    public a(@NotNull SVGAVideoEntity sVGAVideoEntity) {
        p.l(sVGAVideoEntity, "videoItem");
        this.videoItem = sVGAVideoEntity;
        this.scaleInfo = new e();
    }

    public void a(@NotNull Canvas canvas, int i10, @NotNull ImageView.ScaleType scaleType) {
        p.l(canvas, "canvas");
        p.l(scaleType, "scaleType");
        this.scaleInfo.f(canvas.getWidth(), canvas.getHeight(), (float) this.videoItem.getVideoSize().getWidth(), (float) this.videoItem.getVideoSize().getHeight(), scaleType);
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final e getScaleInfo() {
        return this.scaleInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final SVGAVideoEntity getVideoItem() {
        return this.videoItem;
    }

    @NotNull
    public final List<C0733a> d(int frameIndex) {
        String strB;
        List<f> listP = this.videoItem.p();
        ArrayList arrayList = new ArrayList();
        for (f fVar : listP) {
            C0733a c0733a = null;
            if (frameIndex >= 0 && frameIndex < fVar.a().size() && (strB = fVar.getImageKey()) != null && (a0.I(strB, ".matte", false, 2, null) || fVar.a().get(frameIndex).getAlpha() > 0.0d)) {
                c0733a = new C0733a(this, fVar.getMatteKey(), fVar.getImageKey(), fVar.a().get(frameIndex));
            }
            if (c0733a != null) {
                arrayList.add(c0733a);
            }
        }
        return arrayList;
    }
}
