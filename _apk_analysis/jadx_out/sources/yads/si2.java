package yads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import kotlin.Result;

/* JADX INFO: loaded from: classes11.dex */
public final class si2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bn.g f94842a = kotlin.b.b(ri2.f94467b);

    public static Bitmap a(String str) {
        Object objM7534constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            byte[] bArrDecode = Base64.decode(bo.d0.L0(str, "data:image/png;base64,"), 0);
            if (!bo.a0.W(str, "data:image/png;base64,", false, 2, null)) {
                bArrDecode = (bArrDecode.length == 0) ^ true ? cn.p.z((byte[]) f94842a.getValue(), bArrDecode) : new byte[0];
            }
            objM7534constructorimpl = Result.m7534constructorimpl((bArrDecode.length == 0) ^ true ? BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length) : null);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        return (Bitmap) (Result.m7539isFailureimpl(objM7534constructorimpl) ? null : objM7534constructorimpl);
    }
}
