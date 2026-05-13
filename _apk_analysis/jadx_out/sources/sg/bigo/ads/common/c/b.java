package sg.bigo.ads.common.c;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(17)
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f81981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RenderScript f81982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ScriptIntrinsicBlur f81983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Allocation f81984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Allocation f81985e;

    @RequiresApi(api = 17)
    public b(Context context) {
        this.f81981a = context;
    }

    private boolean b() {
        return (this.f81982b == null || this.f81983c == null) ? false : true;
    }

    @Override // sg.bigo.ads.common.c.a
    public final void a() {
        ScriptIntrinsicBlur scriptIntrinsicBlur = this.f81983c;
        if (scriptIntrinsicBlur != null) {
            scriptIntrinsicBlur.destroy();
            this.f81983c = null;
        }
        RenderScript renderScript = this.f81982b;
        if (renderScript != null) {
            renderScript.destroy();
            this.f81982b = null;
        }
        Allocation allocation = this.f81984d;
        if (allocation != null) {
            allocation.destroy();
            this.f81984d = null;
        }
        Allocation allocation2 = this.f81985e;
        if (allocation2 != null) {
            allocation2.destroy();
            this.f81985e = null;
        }
    }

    @Override // sg.bigo.ads.common.c.a
    public final void a(Bitmap bitmap, Bitmap bitmap2) {
        if (b()) {
            if (this.f81984d == null) {
                this.f81984d = Allocation.createFromBitmap(this.f81982b, bitmap);
            }
            if (this.f81985e == null) {
                this.f81985e = Allocation.createFromBitmap(this.f81982b, bitmap2);
            }
            this.f81984d.copyFrom(bitmap);
            this.f81983c.setInput(this.f81984d);
            this.f81983c.forEach(this.f81985e);
            this.f81985e.copyTo(bitmap2);
        }
    }

    public final boolean a(float f10) {
        if (!b()) {
            try {
                RenderScript renderScriptCreate = RenderScript.create(this.f81981a);
                this.f81982b = renderScriptCreate;
                this.f81983c = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            } catch (Exception unused) {
                a();
                return false;
            }
        }
        this.f81983c.setRadius(f10);
        return true;
    }

    @Override // sg.bigo.ads.common.c.a
    public final boolean a(Bitmap bitmap, float f10) {
        if (!a(f10)) {
            return false;
        }
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(this.f81982b, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
        this.f81984d = allocationCreateFromBitmap;
        this.f81985e = Allocation.createTyped(this.f81982b, allocationCreateFromBitmap.getType());
        return true;
    }
}
