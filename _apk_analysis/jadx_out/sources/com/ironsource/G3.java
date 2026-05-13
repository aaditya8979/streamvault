package com.ironsource;

import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class G3 implements InterfaceC4248s7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Boolean f29368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Integer f29369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final N3 f29370c;

    public G3(@Nullable Boolean bool, @Nullable Integer num, @Nullable N3 n32) {
        this.f29368a = bool;
        this.f29369b = num;
        this.f29370c = n32;
    }

    @Override // com.ironsource.InterfaceC4248s7
    @NotNull
    public Object a() {
        Boolean bool = this.f29368a;
        if (bool == null) {
            Result.a aVar = Result.Companion;
            return Result.m7534constructorimpl(kotlin.c.a(new Exception("enabled flag is not provided or invalid")));
        }
        if (!bool.booleanValue()) {
            Result.a aVar2 = Result.Companion;
            return Result.m7534constructorimpl(Boolean.FALSE);
        }
        Integer num = this.f29369b;
        if (num == null || num.intValue() <= 0) {
            Result.a aVar3 = Result.Companion;
            return Result.m7534constructorimpl(kotlin.c.a(new Exception("limit flag is not provided or invalid")));
        }
        if (this.f29370c == null) {
            Result.a aVar4 = Result.Companion;
            return Result.m7534constructorimpl(kotlin.c.a(new Exception("unit flag is not provided or invalid")));
        }
        Result.a aVar5 = Result.Companion;
        return Result.m7534constructorimpl(Boolean.TRUE);
    }
}
