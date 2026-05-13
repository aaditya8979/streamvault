package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sn.a;
import tn.p;

/* JADX INFO: compiled from: TextUnit.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0014\u001a%\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\f\u001a\u00020\u0004*\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0086\bø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\"\u0010\u000f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\r\u001a\u00020\u0004H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u0006\u001a\"\u0010\u000f\u001a\u00020\u0004*\u00020\u00102\u0006\u0010\r\u001a\u00020\u0004H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u0011\u001a\"\u0010\u000f\u001a\u00020\u0004*\u00020\u00122\u0006\u0010\r\u001a\u00020\u0004H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u0013\u001a\"\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0000H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001d\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0004H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a%\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u001a-\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0004H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#\u001a-\u0010)\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0000H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(\"\u0014\u0010*\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010+\"\u0014\u0010,\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010+\"\u0014\u0010-\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010+\"\u0014\u0010.\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010+\"\"\u00103\u001a\u00020/*\u00020\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b2\u0010\u001c\u001a\u0004\b0\u00101\"!\u00106\u001a\u00020/*\u00020\u00048FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b5\u0010\u001c\u001a\u0004\b4\u00101\"!\u0010;\u001a\u00020\u0004*\u00020\u00008FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b9\u0010:\u001a\u0004\b7\u00108\"!\u0010>\u001a\u00020\u0004*\u00020\u00008FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b=\u0010:\u001a\u0004\b<\u00108\"!\u0010;\u001a\u00020\u0004*\u00020\u00108FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b9\u0010@\u001a\u0004\b7\u0010?\"!\u0010>\u001a\u00020\u0004*\u00020\u00108FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b=\u0010@\u001a\u0004\b<\u0010?\"!\u0010;\u001a\u00020\u0004*\u00020\u00128FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b9\u0010B\u001a\u0004\b7\u0010A\"!\u0010>\u001a\u00020\u0004*\u00020\u00128FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b=\u0010B\u001a\u0004\b<\u0010A\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006C"}, d2 = {"", "value", "Landroidx/compose/ui/unit/TextUnitType;", "type", "Landroidx/compose/ui/unit/TextUnit;", "TextUnit-anM5pPY", "(FJ)J", "TextUnit", "Lkotlin/Function0;", "block", "takeOrElse-eAf_CNQ", "(JLsn/a;)J", "takeOrElse", "other", "times-mpE4wyQ", "times", "", "(DJ)J", "", "(IJ)J", "", "unitType", "v", "pack", "(JF)J", "a", "Lbn/r;", "checkArithmetic--R2X_6o", "(J)V", "checkArithmetic", "b", "checkArithmetic-NB67dxo", "(JJ)V", "c", "checkArithmetic-vU-0ePk", "(JJJ)V", "start", "stop", "fraction", "lerp-C3pnCVY", "(JJF)J", "lerp", "UNIT_MASK", "J", "UNIT_TYPE_UNSPECIFIED", "UNIT_TYPE_SP", "UNIT_TYPE_EM", "", "isSpecified--R2X_6o", "(J)Z", "isSpecified--R2X_6o$annotations", "isSpecified", "isUnspecified--R2X_6o", "isUnspecified--R2X_6o$annotations", "isUnspecified", "getSp", "(F)J", "getSp$annotations", "(F)V", "sp", "getEm", "getEm$annotations", "em", "(D)J", "(D)V", "(I)J", "(I)V", "ui-unit_release"}, k = 2, mv = {1, 6, 0})
public final class TextUnitKt {
    private static final long UNIT_MASK = 1095216660480L;
    private static final long UNIT_TYPE_EM = 8589934592L;
    private static final long UNIT_TYPE_SP = 4294967296L;
    private static final long UNIT_TYPE_UNSPECIFIED = 0;

    @ExperimentalUnitApi
    /* JADX INFO: renamed from: TextUnit-anM5pPY, reason: not valid java name */
    public static final long m4019TextUnitanM5pPY(float f10, long j10) {
        return pack(j10, f10);
    }

    /* JADX INFO: renamed from: checkArithmetic--R2X_6o, reason: not valid java name */
    public static final void m4020checkArithmeticR2X_6o(long j10) {
        if (!(!m4025isUnspecifiedR2X_6o(j10))) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        }
    }

    /* JADX INFO: renamed from: checkArithmetic-NB67dxo, reason: not valid java name */
    public static final void m4021checkArithmeticNB67dxo(long j10, long j11) {
        if (!((m4025isUnspecifiedR2X_6o(j10) || m4025isUnspecifiedR2X_6o(j11)) ? false : true)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        }
        if (TextUnitType.m4035equalsimpl0(TextUnit.m4006getTypeUIouoOA(j10), TextUnit.m4006getTypeUIouoOA(j11))) {
            return;
        }
        throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) TextUnitType.m4037toStringimpl(TextUnit.m4006getTypeUIouoOA(j10))) + " and " + ((Object) TextUnitType.m4037toStringimpl(TextUnit.m4006getTypeUIouoOA(j11)))).toString());
    }

    /* JADX INFO: renamed from: checkArithmetic-vU-0ePk, reason: not valid java name */
    public static final void m4022checkArithmeticvU0ePk(long j10, long j11, long j12) {
        if (!((m4025isUnspecifiedR2X_6o(j10) || m4025isUnspecifiedR2X_6o(j11) || m4025isUnspecifiedR2X_6o(j12)) ? false : true)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        }
        if (TextUnitType.m4035equalsimpl0(TextUnit.m4006getTypeUIouoOA(j10), TextUnit.m4006getTypeUIouoOA(j11)) && TextUnitType.m4035equalsimpl0(TextUnit.m4006getTypeUIouoOA(j11), TextUnit.m4006getTypeUIouoOA(j12))) {
            return;
        }
        throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) TextUnitType.m4037toStringimpl(TextUnit.m4006getTypeUIouoOA(j10))) + " and " + ((Object) TextUnitType.m4037toStringimpl(TextUnit.m4006getTypeUIouoOA(j11)))).toString());
    }

    public static final long getEm(double d10) {
        return pack(UNIT_TYPE_EM, (float) d10);
    }

    public static final long getEm(float f10) {
        return pack(UNIT_TYPE_EM, f10);
    }

    public static final long getEm(int i10) {
        return pack(UNIT_TYPE_EM, i10);
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(double d10) {
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(float f10) {
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(int i10) {
    }

    public static final long getSp(double d10) {
        return pack(UNIT_TYPE_SP, (float) d10);
    }

    public static final long getSp(float f10) {
        return pack(UNIT_TYPE_SP, f10);
    }

    public static final long getSp(int i10) {
        return pack(UNIT_TYPE_SP, i10);
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(double d10) {
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(float f10) {
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(int i10) {
    }

    /* JADX INFO: renamed from: isSpecified--R2X_6o, reason: not valid java name */
    public static final boolean m4023isSpecifiedR2X_6o(long j10) {
        return !m4025isUnspecifiedR2X_6o(j10);
    }

    @Stable
    /* JADX INFO: renamed from: isSpecified--R2X_6o$annotations, reason: not valid java name */
    public static /* synthetic */ void m4024isSpecifiedR2X_6o$annotations(long j10) {
    }

    /* JADX INFO: renamed from: isUnspecified--R2X_6o, reason: not valid java name */
    public static final boolean m4025isUnspecifiedR2X_6o(long j10) {
        return TextUnit.m4005getRawTypeimpl(j10) == 0;
    }

    @Stable
    /* JADX INFO: renamed from: isUnspecified--R2X_6o$annotations, reason: not valid java name */
    public static /* synthetic */ void m4026isUnspecifiedR2X_6o$annotations(long j10) {
    }

    @Stable
    /* JADX INFO: renamed from: lerp-C3pnCVY, reason: not valid java name */
    public static final long m4027lerpC3pnCVY(long j10, long j11, float f10) {
        m4021checkArithmeticNB67dxo(j10, j11);
        return pack(TextUnit.m4005getRawTypeimpl(j10), MathHelpersKt.lerp(TextUnit.m4007getValueimpl(j10), TextUnit.m4007getValueimpl(j11), f10));
    }

    public static final long pack(long j10, float f10) {
        return TextUnit.m3999constructorimpl(j10 | (((long) Float.floatToIntBits(f10)) & 4294967295L));
    }

    /* JADX INFO: renamed from: takeOrElse-eAf_CNQ, reason: not valid java name */
    public static final long m4028takeOrElseeAf_CNQ(long j10, @NotNull a<TextUnit> aVar) {
        p.k(aVar, "block");
        return m4025isUnspecifiedR2X_6o(j10) ^ true ? j10 : aVar.invoke().getPackedValue();
    }

    @Stable
    /* JADX INFO: renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m4029timesmpE4wyQ(double d10, long j10) {
        m4020checkArithmeticR2X_6o(j10);
        return pack(TextUnit.m4005getRawTypeimpl(j10), ((float) d10) * TextUnit.m4007getValueimpl(j10));
    }

    @Stable
    /* JADX INFO: renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m4030timesmpE4wyQ(float f10, long j10) {
        m4020checkArithmeticR2X_6o(j10);
        return pack(TextUnit.m4005getRawTypeimpl(j10), f10 * TextUnit.m4007getValueimpl(j10));
    }

    @Stable
    /* JADX INFO: renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m4031timesmpE4wyQ(int i10, long j10) {
        m4020checkArithmeticR2X_6o(j10);
        return pack(TextUnit.m4005getRawTypeimpl(j10), i10 * TextUnit.m4007getValueimpl(j10));
    }
}
