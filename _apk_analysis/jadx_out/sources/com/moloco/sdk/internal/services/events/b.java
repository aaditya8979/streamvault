package com.moloco.sdk.internal.services.events;

import com.moloco.sdk.UserIntent$UserAdInteractionExt;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47404a;

        static {
            int[] iArr = new int[a.AbstractC0696a.c.EnumC0698a.values().length];
            try {
                iArr[a.AbstractC0696a.c.EnumC0698a.f50943a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.AbstractC0696a.c.EnumC0698a.f50944b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.AbstractC0696a.c.EnumC0698a.f50945c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.AbstractC0696a.c.EnumC0698a.f50946d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.AbstractC0696a.c.EnumC0698a.f50947e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.AbstractC0696a.c.EnumC0698a.f50948f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[a.AbstractC0696a.c.EnumC0698a.f50949g.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[a.AbstractC0696a.c.EnumC0698a.f50950h.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[a.AbstractC0696a.c.EnumC0698a.f50951i.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f47404a = iArr;
        }
    }

    @NotNull
    public static final UserIntent$UserAdInteractionExt.Button.Type a(@NotNull a.AbstractC0696a.c.EnumC0698a enumC0698a) {
        p.k(enumC0698a, "<this>");
        switch (a.f47404a[enumC0698a.ordinal()]) {
            case 1:
                return UserIntent$UserAdInteractionExt.Button.Type.NONE;
            case 2:
                return UserIntent$UserAdInteractionExt.Button.Type.CLOSE;
            case 3:
                return UserIntent$UserAdInteractionExt.Button.Type.SKIP;
            case 4:
                return UserIntent$UserAdInteractionExt.Button.Type.DEC_SKIP;
            case 5:
                return UserIntent$UserAdInteractionExt.Button.Type.MUTE;
            case 6:
                return UserIntent$UserAdInteractionExt.Button.Type.UNMUTE;
            case 7:
                return UserIntent$UserAdInteractionExt.Button.Type.CTA;
            case 8:
                return UserIntent$UserAdInteractionExt.Button.Type.REPLAY;
            case 9:
                return UserIntent$UserAdInteractionExt.Button.Type.AD_BADGE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    public static final UserIntent$UserAdInteractionExt.i b(@NotNull a.AbstractC0696a.f fVar) {
        p.k(fVar, "<this>");
        UserIntent$UserAdInteractionExt.i.a aVarD = UserIntent$UserAdInteractionExt.i.d();
        aVarD.a(fVar.a());
        aVarD.b(fVar.b());
        UserIntent$UserAdInteractionExt.i iVarBuild = aVarD.build();
        p.j(iVarBuild, "build(...)");
        return iVarBuild;
    }

    @NotNull
    public static final UserIntent$UserAdInteractionExt.j c(@NotNull com.moloco.sdk.internal.services.e eVar) {
        p.k(eVar, "<this>");
        UserIntent$UserAdInteractionExt.j.a aVarD = UserIntent$UserAdInteractionExt.j.d();
        aVarD.b(eVar.e());
        aVarD.a(eVar.c());
        UserIntent$UserAdInteractionExt.j jVarBuild = aVarD.build();
        p.j(jVarBuild, "build(...)");
        return jVarBuild;
    }

    @NotNull
    public static final UserIntent$UserAdInteractionExt.j d(@NotNull a.AbstractC0696a.g gVar) {
        p.k(gVar, "<this>");
        UserIntent$UserAdInteractionExt.j.a aVarD = UserIntent$UserAdInteractionExt.j.d();
        aVarD.b(gVar.b());
        aVarD.a(gVar.a());
        UserIntent$UserAdInteractionExt.j jVarBuild = aVarD.build();
        p.j(jVarBuild, "build(...)");
        return jVarBuild;
    }
}
