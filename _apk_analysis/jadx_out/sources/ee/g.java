package ee;

import android.graphics.Matrix;
import androidx.core.graphics.drawable.IconCompat;
import cn.f0;
import cn.w;
import cn.x;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.opensource.svgaplayer.entities.SVGAVideoShapeEntity;
import com.opensource.svgaplayer.proto.FrameEntity;
import com.opensource.svgaplayer.proto.Layout;
import com.opensource.svgaplayer.proto.ShapeEntity;
import com.opensource.svgaplayer.proto.Transform;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import tn.p;

/* JADX INFO: compiled from: SVGAVideoSpriteFrameEntity.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)B\u0011\b\u0016\u0012\u0006\u0010'\u001a\u00020*¢\u0006\u0004\b(\u0010+R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\"\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001e\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0011\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010!\u001a\u0004\b\u0019\u0010\"\"\u0004\b#\u0010$¨\u0006,"}, d2 = {"Lee/g;", "", "", "a", "D", "()D", "setAlpha", "(D)V", "alpha", "Lfe/c;", "b", "Lfe/c;", "()Lfe/c;", "setLayout", "(Lfe/c;)V", "layout", "Landroid/graphics/Matrix;", "c", "Landroid/graphics/Matrix;", "e", "()Landroid/graphics/Matrix;", "setTransform", "(Landroid/graphics/Matrix;)V", "transform", "Lee/b;", "d", "Lee/b;", "()Lee/b;", "setMaskPath", "(Lee/b;)V", "maskPath", "", "Lcom/opensource/svgaplayer/entities/SVGAVideoShapeEntity;", "Ljava/util/List;", "()Ljava/util/List;", InneractiveMediationDefs.GENDER_FEMALE, "(Ljava/util/List;)V", "shapes", "Lorg/json/JSONObject;", IconCompat.EXTRA_OBJ, "<init>", "(Lorg/json/JSONObject;)V", "Lcom/opensource/svgaplayer/proto/FrameEntity;", "(Lcom/opensource/svgaplayer/proto/FrameEntity;)V", "com.opensource.svgaplayer"}, k = 1, mv = {1, 4, 0})
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public double alpha;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public fe.c layout;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Matrix transform;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public b maskPath;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<SVGAVideoShapeEntity> shapes;

    public g(@NotNull FrameEntity frameEntity) {
        p.l(frameEntity, IconCompat.EXTRA_OBJ);
        this.layout = new fe.c(0.0d, 0.0d, 0.0d, 0.0d);
        this.transform = new Matrix();
        this.shapes = w.m();
        this.alpha = frameEntity.alpha != null ? r0.floatValue() : 0.0f;
        Layout layout = frameEntity.layout;
        if (layout != null) {
            Float f10 = layout.f51210x;
            double dFloatValue = f10 != null ? f10.floatValue() : 0.0f;
            Float f11 = layout.f51211y;
            double dFloatValue2 = f11 != null ? f11.floatValue() : 0.0f;
            Float f12 = layout.width;
            this.layout = new fe.c(dFloatValue, dFloatValue2, f12 != null ? f12.floatValue() : 0.0f, layout.height != null ? r0.floatValue() : 0.0f);
        }
        Transform transform = frameEntity.transform;
        if (transform != null) {
            float[] fArr = new float[9];
            Float f13 = transform.f51270a;
            float fFloatValue = f13 != null ? f13.floatValue() : 1.0f;
            Float f14 = transform.f51271b;
            float fFloatValue2 = f14 != null ? f14.floatValue() : 0.0f;
            Float f15 = transform.f51272c;
            float fFloatValue3 = f15 != null ? f15.floatValue() : 0.0f;
            Float f16 = transform.f51273d;
            float fFloatValue4 = f16 != null ? f16.floatValue() : 1.0f;
            Float f17 = transform.tx;
            float fFloatValue5 = f17 != null ? f17.floatValue() : 0.0f;
            Float f18 = transform.ty;
            float fFloatValue6 = f18 != null ? f18.floatValue() : 0.0f;
            fArr[0] = fFloatValue;
            fArr[1] = fFloatValue3;
            fArr[2] = fFloatValue5;
            fArr[3] = fFloatValue2;
            fArr[4] = fFloatValue4;
            fArr[5] = fFloatValue6;
            fArr[6] = 0.0f;
            fArr[7] = 0.0f;
            fArr[8] = 1.0f;
            this.transform.setValues(fArr);
        }
        String str = frameEntity.clipPath;
        if (str != null) {
            str = str.length() > 0 ? str : null;
            if (str != null) {
                this.maskPath = new b(str);
            }
        }
        List<ShapeEntity> list = frameEntity.shapes;
        p.g(list, "obj.shapes");
        ArrayList arrayList = new ArrayList(x.x(list, 10));
        for (ShapeEntity shapeEntity : list) {
            p.g(shapeEntity, "it");
            arrayList.add(new SVGAVideoShapeEntity(shapeEntity));
        }
        this.shapes = arrayList;
    }

    public g(@NotNull JSONObject jSONObject) {
        int i10;
        int i11;
        g gVar = this;
        p.l(jSONObject, IconCompat.EXTRA_OBJ);
        gVar.layout = new fe.c(0.0d, 0.0d, 0.0d, 0.0d);
        gVar.transform = new Matrix();
        gVar.shapes = w.m();
        gVar.alpha = jSONObject.optDouble("alpha", 0.0d);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("layout");
        if (jSONObjectOptJSONObject != null) {
            gVar.layout = new fe.c(jSONObjectOptJSONObject.optDouble(VastAttributes.HORIZONTAL_POSITION, 0.0d), jSONObjectOptJSONObject.optDouble(VastAttributes.VERTICAL_POSITION, 0.0d), jSONObjectOptJSONObject.optDouble("width", 0.0d), jSONObjectOptJSONObject.optDouble("height", 0.0d));
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("transform");
        if (jSONObjectOptJSONObject2 != null) {
            double dOptDouble = jSONObjectOptJSONObject2.optDouble("a", 1.0d);
            double dOptDouble2 = jSONObjectOptJSONObject2.optDouble("b", 0.0d);
            double dOptDouble3 = jSONObjectOptJSONObject2.optDouble("c", 0.0d);
            double dOptDouble4 = jSONObjectOptJSONObject2.optDouble("d", 1.0d);
            double dOptDouble5 = jSONObjectOptJSONObject2.optDouble("tx", 0.0d);
            double dOptDouble6 = jSONObjectOptJSONObject2.optDouble("ty", 0.0d);
            i11 = 0;
            float f10 = (float) dOptDouble3;
            i10 = 1;
            float f11 = (float) 0.0d;
            float[] fArr = {(float) dOptDouble, f10, (float) dOptDouble5, (float) dOptDouble2, (float) dOptDouble4, (float) dOptDouble6, f11, f11, (float) 1.0d};
            gVar = this;
            gVar.transform.setValues(fArr);
        } else {
            i10 = 1;
            i11 = 0;
        }
        String strOptString = jSONObject.optString("clipPath");
        if (strOptString != null) {
            if ((strOptString.length() <= 0 ? i11 : i10) != 0) {
                gVar.maskPath = new b(strOptString);
            }
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("shapes");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i12 = i11; i12 < length; i12++) {
                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i12);
                if (jSONObjectOptJSONObject3 != null) {
                    arrayList.add(new SVGAVideoShapeEntity(jSONObjectOptJSONObject3));
                }
            }
            gVar.shapes = f0.g1(arrayList);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getAlpha() {
        return this.alpha;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final fe.c getLayout() {
        return this.layout;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final b getMaskPath() {
        return this.maskPath;
    }

    @NotNull
    public final List<SVGAVideoShapeEntity> d() {
        return this.shapes;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Matrix getTransform() {
        return this.transform;
    }

    public final void f(@NotNull List<SVGAVideoShapeEntity> list) {
        p.l(list, "<set-?>");
        this.shapes = list;
    }
}
