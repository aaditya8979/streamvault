package kotlin.text;

import bo.e;
import kn.a;
import org.jetbrains.annotations.NotNull;
import tn.i;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class RegexOption implements e {
    public static final RegexOption CANON_EQ;
    public static final RegexOption COMMENTS;
    public static final RegexOption DOT_MATCHES_ALL;
    public static final RegexOption IGNORE_CASE;
    public static final RegexOption LITERAL;
    public static final RegexOption MULTILINE;
    public static final RegexOption UNIX_LINES;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ RegexOption[] f73242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f73243c;
    private final int mask;
    private final int value;

    static {
        int i10 = 2;
        IGNORE_CASE = new RegexOption("IGNORE_CASE", 0, i10, 0, 2, null);
        int i11 = 0;
        int i12 = 2;
        i iVar = null;
        MULTILINE = new RegexOption("MULTILINE", 1, 8, i11, i12, iVar);
        int i13 = 0;
        int i14 = 2;
        i iVar2 = null;
        LITERAL = new RegexOption("LITERAL", i10, 16, i13, i14, iVar2);
        UNIX_LINES = new RegexOption("UNIX_LINES", 3, 1, i11, i12, iVar);
        COMMENTS = new RegexOption("COMMENTS", 4, 4, i13, i14, iVar2);
        DOT_MATCHES_ALL = new RegexOption("DOT_MATCHES_ALL", 5, 32, i11, i12, iVar);
        CANON_EQ = new RegexOption("CANON_EQ", 6, 128, i13, i14, iVar2);
        RegexOption[] regexOptionArrD = d();
        f73242b = regexOptionArrD;
        f73243c = kotlin.enums.a.a(regexOptionArrD);
    }

    public RegexOption(String str, int i10, int i11, int i12) {
        this.value = i11;
        this.mask = i12;
    }

    public /* synthetic */ RegexOption(String str, int i10, int i11, int i12, int i13, i iVar) {
        this(str, i10, i11, (i13 & 2) != 0 ? i11 : i12);
    }

    public static final /* synthetic */ RegexOption[] d() {
        return new RegexOption[]{IGNORE_CASE, MULTILINE, LITERAL, UNIX_LINES, COMMENTS, DOT_MATCHES_ALL, CANON_EQ};
    }

    @NotNull
    public static a<RegexOption> getEntries() {
        return f73243c;
    }

    public static RegexOption valueOf(String str) {
        return (RegexOption) Enum.valueOf(RegexOption.class, str);
    }

    public static RegexOption[] values() {
        return (RegexOption[]) f73242b.clone();
    }

    @Override // bo.e
    public int getMask() {
        return this.mask;
    }

    @Override // bo.e
    public int getValue() {
        return this.value;
    }
}
