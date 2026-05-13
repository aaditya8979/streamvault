package androidx.sqlite.db;

import com.ironsource.G5;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.regex.Pattern;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: SupportSQLiteQueryBuilder.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u0011\b\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\"\u0010\b\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00032\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002J'\u0010\u000b\u001a\u00020\u0007*\u00060\u0002j\u0002`\u00032\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\r\u001a\u00020\u0000J\u001f\u0010\n\u001a\u00020\u00002\u0010\u0010\n\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000eJ+\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0010\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t¢\u0006\u0004\b\u000f\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0004J\u0006\u0010\u0017\u001a\u00020\u0016R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\r\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001bR \u0010\n\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\"\u0010\u0010\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001dR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019¨\u0006!"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteQueryBuilder;", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "name", "clause", "Lbn/r;", "appendClause", "", "columns", "appendColumns", "(Ljava/lang/StringBuilder;[Ljava/lang/String;)V", "distinct", "([Ljava/lang/String;)Landroidx/sqlite/db/SupportSQLiteQueryBuilder;", "selection", "bindArgs", "(Ljava/lang/String;[Ljava/lang/Object;)Landroidx/sqlite/db/SupportSQLiteQueryBuilder;", "groupBy", "having", "orderBy", "limit", "Landroidx/sqlite/db/SupportSQLiteQuery;", "create", G5.Q, "Ljava/lang/String;", "", "Z", "[Ljava/lang/String;", "[Ljava/lang/Object;", "<init>", "(Ljava/lang/String;)V", VastTagName.COMPANION, "sqlite_release"}, k = 1, mv = {1, 7, 1})
public final class SupportSQLiteQueryBuilder {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final Pattern limitPattern = Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");

    @Nullable
    private Object[] bindArgs;

    @Nullable
    private String[] columns;
    private boolean distinct;

    @Nullable
    private String groupBy;

    @Nullable
    private String having;

    @Nullable
    private String limit;

    @Nullable
    private String orderBy;

    @Nullable
    private String selection;

    @NotNull
    private final String table;

    /* JADX INFO: compiled from: SupportSQLiteQueryBuilder.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteQueryBuilder$Companion;", "", "()V", "limitPattern", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "builder", "Landroidx/sqlite/db/SupportSQLiteQueryBuilder;", "tableName", "", "sqlite_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final SupportSQLiteQueryBuilder builder(@NotNull String tableName) {
            p.k(tableName, "tableName");
            return new SupportSQLiteQueryBuilder(tableName, null);
        }
    }

    private SupportSQLiteQueryBuilder(String str) {
        this.table = str;
    }

    public /* synthetic */ SupportSQLiteQueryBuilder(String str, i iVar) {
        this(str);
    }

    private final void appendClause(StringBuilder sb2, String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return;
        }
        sb2.append(str);
        sb2.append(str2);
    }

    private final void appendColumns(StringBuilder sb2, String[] strArr) {
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArr[i10];
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(str);
        }
        sb2.append(' ');
    }

    @NotNull
    public static final SupportSQLiteQueryBuilder builder(@NotNull String str) {
        return INSTANCE.builder(str);
    }

    @NotNull
    public final SupportSQLiteQueryBuilder columns(@Nullable String[] columns) {
        this.columns = columns;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0049  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.sqlite.db.SupportSQLiteQuery create() {
        /*
            r5 = this;
            java.lang.String r0 = r5.groupBy
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lf
            int r0 = r0.length()
            if (r0 != 0) goto Ld
            goto Lf
        Ld:
            r0 = r1
            goto L10
        Lf:
            r0 = r2
        L10:
            if (r0 == 0) goto L25
            java.lang.String r0 = r5.having
            if (r0 == 0) goto L1f
            int r0 = r0.length()
            if (r0 != 0) goto L1d
            goto L1f
        L1d:
            r0 = r1
            goto L20
        L1f:
            r0 = r2
        L20:
            if (r0 == 0) goto L23
            goto L25
        L23:
            r0 = r1
            goto L26
        L25:
            r0 = r2
        L26:
            if (r0 == 0) goto L96
            r0 = 120(0x78, float:1.68E-43)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            java.lang.String r0 = "SELECT "
            r3.append(r0)
            boolean r0 = r5.distinct
            if (r0 == 0) goto L3d
            java.lang.String r0 = "DISTINCT "
            r3.append(r0)
        L3d:
            java.lang.String[] r0 = r5.columns
            if (r0 == 0) goto L49
            int r4 = r0.length
            if (r4 != 0) goto L46
            r4 = r2
            goto L47
        L46:
            r4 = r1
        L47:
            if (r4 == 0) goto L4a
        L49:
            r1 = r2
        L4a:
            if (r1 != 0) goto L53
            tn.p.h(r0)
            r5.appendColumns(r3, r0)
            goto L58
        L53:
            java.lang.String r0 = "* "
            r3.append(r0)
        L58:
            java.lang.String r0 = "FROM "
            r3.append(r0)
            java.lang.String r0 = r5.table
            r3.append(r0)
            java.lang.String r0 = r5.selection
            java.lang.String r1 = " WHERE "
            r5.appendClause(r3, r1, r0)
            java.lang.String r0 = r5.groupBy
            java.lang.String r1 = " GROUP BY "
            r5.appendClause(r3, r1, r0)
            java.lang.String r0 = r5.having
            java.lang.String r1 = " HAVING "
            r5.appendClause(r3, r1, r0)
            java.lang.String r0 = r5.orderBy
            java.lang.String r1 = " ORDER BY "
            r5.appendClause(r3, r1, r0)
            java.lang.String r0 = r5.limit
            java.lang.String r1 = " LIMIT "
            r5.appendClause(r3, r1, r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = "StringBuilder(capacity).…builderAction).toString()"
            tn.p.j(r0, r1)
            androidx.sqlite.db.SimpleSQLiteQuery r1 = new androidx.sqlite.db.SimpleSQLiteQuery
            java.lang.Object[] r2 = r5.bindArgs
            r1.<init>(r0, r2)
            return r1
        L96:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "HAVING clauses are only permitted when using a groupBy clause"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.sqlite.db.SupportSQLiteQueryBuilder.create():androidx.sqlite.db.SupportSQLiteQuery");
    }

    @NotNull
    public final SupportSQLiteQueryBuilder distinct() {
        this.distinct = true;
        return this;
    }

    @NotNull
    public final SupportSQLiteQueryBuilder groupBy(@Nullable String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    @NotNull
    public final SupportSQLiteQueryBuilder having(@Nullable String having) {
        this.having = having;
        return this;
    }

    @NotNull
    public final SupportSQLiteQueryBuilder limit(@NotNull String limit) {
        p.k(limit, "limit");
        boolean zMatches = limitPattern.matcher(limit).matches();
        boolean z10 = true;
        if (!(limit.length() == 0) && !zMatches) {
            z10 = false;
        }
        if (z10) {
            this.limit = limit;
            return this;
        }
        throw new IllegalArgumentException(("invalid LIMIT clauses:" + limit).toString());
    }

    @NotNull
    public final SupportSQLiteQueryBuilder orderBy(@Nullable String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    @NotNull
    public final SupportSQLiteQueryBuilder selection(@Nullable String selection, @Nullable Object[] bindArgs) {
        this.selection = selection;
        this.bindArgs = bindArgs;
        return this;
    }
}
