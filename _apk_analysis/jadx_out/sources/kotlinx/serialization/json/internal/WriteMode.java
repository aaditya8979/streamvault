package kotlinx.serialization.json.internal;

import kn.a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: WriteMode.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class WriteMode {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ WriteMode[] f73480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f73481c;
    public final char begin;
    public final char end;
    public static final WriteMode OBJ = new WriteMode("OBJ", 0, '{', '}');
    public static final WriteMode LIST = new WriteMode("LIST", 1, '[', ']');
    public static final WriteMode MAP = new WriteMode("MAP", 2, '{', '}');
    public static final WriteMode POLY_OBJ = new WriteMode("POLY_OBJ", 3, '[', ']');

    static {
        WriteMode[] writeModeArrD = d();
        f73480b = writeModeArrD;
        f73481c = kotlin.enums.a.a(writeModeArrD);
    }

    public WriteMode(String str, int i10, char c10, char c11) {
        this.begin = c10;
        this.end = c11;
    }

    public static final /* synthetic */ WriteMode[] d() {
        return new WriteMode[]{OBJ, LIST, MAP, POLY_OBJ};
    }

    @NotNull
    public static a<WriteMode> getEntries() {
        return f73481c;
    }

    public static WriteMode valueOf(String str) {
        return (WriteMode) Enum.valueOf(WriteMode.class, str);
    }

    public static WriteMode[] values() {
        return (WriteMode[]) f73480b.clone();
    }
}
