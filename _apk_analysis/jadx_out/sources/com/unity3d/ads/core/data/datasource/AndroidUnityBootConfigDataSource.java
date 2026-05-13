package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import bn.r;
import bo.a0;
import bo.c;
import com.ironsource.G5;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import kotlin.Result;
import kotlin.jvm.internal.Ref$ObjectRef;
import on.b;
import on.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: AndroidUnityBootConfigDataSource.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class AndroidUnityBootConfigDataSource implements UnityBootConfigDataSource {

    @NotNull
    private final Context context;

    public AndroidUnityBootConfigDataSource(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        this.context = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.unity3d.ads.core.data.datasource.UnityBootConfigDataSource
    @Nullable
    public String getValue(@NotNull String str) {
        Object objM7534constructorimpl;
        p.k(str, "key");
        try {
            Result.a aVar = Result.Companion;
            final String str2 = str + G5.T;
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            InputStream inputStreamOpen = this.context.getAssets().open("bin/Data/boot.config");
            try {
                p.j(inputStreamOpen, "stream");
                Reader inputStreamReader = new InputStreamReader(inputStreamOpen, c.f5639b);
                k.c(inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192), new l<String, r>() { // from class: com.unity3d.ads.core.data.datasource.AndroidUnityBootConfigDataSource$getValue$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // sn.l
                    public /* bridge */ /* synthetic */ r invoke(String str3) {
                        invoke2(str3);
                        return r.f5635a;
                    }

                    /* JADX WARN: Type inference failed for: r5v1, types: [T, java.lang.Object, java.lang.String] */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull String str3) {
                        p.k(str3, "line");
                        if (a0.W(str3, str2, false, 2, null)) {
                            Ref$ObjectRef<String> ref$ObjectRef2 = ref$ObjectRef;
                            ?? Substring = str3.substring(str2.length());
                            p.j(Substring, "this as java.lang.String).substring(startIndex)");
                            ref$ObjectRef2.element = Substring;
                        }
                    }
                });
                r rVar = r.f5635a;
                b.a(inputStreamOpen, null);
                objM7534constructorimpl = Result.m7534constructorimpl((String) ref$ObjectRef.element);
            } finally {
            }
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        return (String) (Result.m7539isFailureimpl(objM7534constructorimpl) ? null : objM7534constructorimpl);
    }
}
