package yads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.UserManager;
import kotlin.Result;

/* JADX INFO: loaded from: classes3.dex */
public final class oy2 {
    public static SharedPreferences a(oy2 oy2Var, Context context, String str) {
        Object objM7534constructorimpl;
        oy2Var.getClass();
        try {
            Result.a aVar = Result.Companion;
            Object systemService = context.getSystemService("user");
            tn.p.i(systemService, "null cannot be cast to non-null type android.os.UserManager");
            objM7534constructorimpl = Result.m7534constructorimpl(Boolean.valueOf(((UserManager) systemService).isUserUnlocked()));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        Boolean bool = Boolean.TRUE;
        if (Result.m7539isFailureimpl(objM7534constructorimpl)) {
            objM7534constructorimpl = bool;
        }
        return !((Boolean) objM7534constructorimpl).booleanValue() ? context.createDeviceProtectedStorageContext().getSharedPreferences(str, 0) : context.getSharedPreferences(str, 0);
    }
}
