package io.ktor.util.date;

import org.jetbrains.annotations.NotNull;
import tn.i;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Date.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class Month {

    @NotNull
    public static final a Companion;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Month[] f71222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kn.a f71223c;

    @NotNull
    private final String value;
    public static final Month JANUARY = new Month("JANUARY", 0, "Jan");
    public static final Month FEBRUARY = new Month("FEBRUARY", 1, "Feb");
    public static final Month MARCH = new Month("MARCH", 2, "Mar");
    public static final Month APRIL = new Month("APRIL", 3, "Apr");
    public static final Month MAY = new Month("MAY", 4, "May");
    public static final Month JUNE = new Month("JUNE", 5, "Jun");
    public static final Month JULY = new Month("JULY", 6, "Jul");
    public static final Month AUGUST = new Month("AUGUST", 7, "Aug");
    public static final Month SEPTEMBER = new Month("SEPTEMBER", 8, "Sep");
    public static final Month OCTOBER = new Month("OCTOBER", 9, "Oct");
    public static final Month NOVEMBER = new Month("NOVEMBER", 10, "Nov");
    public static final Month DECEMBER = new Month("DECEMBER", 11, "Dec");

    /* JADX INFO: compiled from: Date.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        @NotNull
        public final Month a(int i10) {
            return Month.getEntries().get(i10);
        }
    }

    static {
        Month[] monthArrD = d();
        f71222b = monthArrD;
        f71223c = kotlin.enums.a.a(monthArrD);
        Companion = new a(null);
    }

    public Month(String str, int i10, String str2) {
        this.value = str2;
    }

    public static final /* synthetic */ Month[] d() {
        return new Month[]{JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};
    }

    @NotNull
    public static kn.a<Month> getEntries() {
        return f71223c;
    }

    public static Month valueOf(String str) {
        return (Month) Enum.valueOf(Month.class, str);
    }

    public static Month[] values() {
        return (Month[]) f71222b.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
