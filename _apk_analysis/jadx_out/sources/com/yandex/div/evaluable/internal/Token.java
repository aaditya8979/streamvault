package com.yandex.div.evaluable.internal;

import com.safedk.android.analytics.brandsafety.ImpressionLog;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: Token.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface Token {

    /* JADX INFO: compiled from: Token.kt */
    public static final class Function implements Token {

        @NotNull
        private final String name;

        /* JADX INFO: compiled from: Token.kt */
        public static final class ArgumentDelimiter implements Token {

            @NotNull
            public static final ArgumentDelimiter INSTANCE = new ArgumentDelimiter();

            private ArgumentDelimiter() {
            }

            @NotNull
            public String toString() {
                return StringUtils.COMMA;
            }
        }

        public Function(@NotNull String str) {
            p.k(str, "name");
            this.name = str;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Function) && p.f(this.name, ((Function) obj).name);
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        @NotNull
        public String toString() {
            return "Function(name=" + this.name + ')';
        }
    }

    /* JADX INFO: compiled from: Token.kt */
    public interface Operand extends Token {

        /* JADX INFO: compiled from: Token.kt */
        public interface Literal extends Operand {

            /* JADX INFO: compiled from: Token.kt */
            public static final class Bool implements Literal {
                private final boolean value;

                private /* synthetic */ Bool(boolean z10) {
                    this.value = z10;
                }

                /* JADX INFO: renamed from: box-impl, reason: not valid java name */
                public static final /* synthetic */ Bool m7416boximpl(boolean z10) {
                    return new Bool(z10);
                }

                /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
                public static boolean m7417constructorimpl(boolean z10) {
                    return z10;
                }

                /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
                public static boolean m7418equalsimpl(boolean z10, Object obj) {
                    return (obj instanceof Bool) && z10 == ((Bool) obj).m7421unboximpl();
                }

                /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
                public static int m7419hashCodeimpl(boolean z10) {
                    if (z10) {
                        return 1;
                    }
                    return z10 ? 1 : 0;
                }

                /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
                public static String m7420toStringimpl(boolean z10) {
                    return "Bool(value=" + z10 + ')';
                }

                public boolean equals(Object obj) {
                    return m7418equalsimpl(this.value, obj);
                }

                public int hashCode() {
                    return m7419hashCodeimpl(this.value);
                }

                public String toString() {
                    return m7420toStringimpl(this.value);
                }

                /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
                public final /* synthetic */ boolean m7421unboximpl() {
                    return this.value;
                }
            }

            /* JADX INFO: compiled from: Token.kt */
            public static final class Num implements Literal {

                @NotNull
                private final Number value;

                private /* synthetic */ Num(Number number) {
                    this.value = number;
                }

                /* JADX INFO: renamed from: box-impl, reason: not valid java name */
                public static final /* synthetic */ Num m7422boximpl(Number number) {
                    return new Num(number);
                }

                @NotNull
                /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
                public static Number m7423constructorimpl(@NotNull Number number) {
                    p.k(number, "value");
                    return number;
                }

                /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
                public static boolean m7424equalsimpl(Number number, Object obj) {
                    return (obj instanceof Num) && p.f(number, ((Num) obj).m7427unboximpl());
                }

                /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
                public static int m7425hashCodeimpl(Number number) {
                    return number.hashCode();
                }

                /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
                public static String m7426toStringimpl(Number number) {
                    return "Num(value=" + number + ')';
                }

                public boolean equals(Object obj) {
                    return m7424equalsimpl(this.value, obj);
                }

                public int hashCode() {
                    return m7425hashCodeimpl(this.value);
                }

                public String toString() {
                    return m7426toStringimpl(this.value);
                }

                /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
                public final /* synthetic */ Number m7427unboximpl() {
                    return this.value;
                }
            }

            /* JADX INFO: compiled from: Token.kt */
            public static final class Str implements Literal {

                @NotNull
                private final String value;

                private /* synthetic */ Str(String str) {
                    this.value = str;
                }

                /* JADX INFO: renamed from: box-impl, reason: not valid java name */
                public static final /* synthetic */ Str m7428boximpl(String str) {
                    return new Str(str);
                }

                @NotNull
                /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
                public static String m7429constructorimpl(@NotNull String str) {
                    p.k(str, "value");
                    return str;
                }

                /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
                public static boolean m7430equalsimpl(String str, Object obj) {
                    return (obj instanceof Str) && p.f(str, ((Str) obj).m7433unboximpl());
                }

                /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
                public static int m7431hashCodeimpl(String str) {
                    return str.hashCode();
                }

                /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
                public static String m7432toStringimpl(String str) {
                    return "Str(value=" + str + ')';
                }

                public boolean equals(Object obj) {
                    return m7430equalsimpl(this.value, obj);
                }

                public int hashCode() {
                    return m7431hashCodeimpl(this.value);
                }

                public String toString() {
                    return m7432toStringimpl(this.value);
                }

                /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
                public final /* synthetic */ String m7433unboximpl() {
                    return this.value;
                }
            }
        }

        /* JADX INFO: compiled from: Token.kt */
        public static final class Variable implements Operand {

            @NotNull
            private final String name;

            private /* synthetic */ Variable(String str) {
                this.name = str;
            }

            /* JADX INFO: renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Variable m7434boximpl(String str) {
                return new Variable(str);
            }

            @NotNull
            /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
            public static String m7435constructorimpl(@NotNull String str) {
                p.k(str, "name");
                return str;
            }

            /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
            public static boolean m7436equalsimpl(String str, Object obj) {
                return (obj instanceof Variable) && p.f(str, ((Variable) obj).m7440unboximpl());
            }

            /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m7437equalsimpl0(String str, String str2) {
                return p.f(str, str2);
            }

            /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
            public static int m7438hashCodeimpl(String str) {
                return str.hashCode();
            }

            /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
            public static String m7439toStringimpl(String str) {
                return "Variable(name=" + str + ')';
            }

            public boolean equals(Object obj) {
                return m7436equalsimpl(this.name, obj);
            }

            public int hashCode() {
                return m7438hashCodeimpl(this.name);
            }

            public String toString() {
                return m7439toStringimpl(this.name);
            }

            /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ String m7440unboximpl() {
                return this.name;
            }
        }
    }

    /* JADX INFO: compiled from: Token.kt */
    public interface Operator extends Token {

        /* JADX INFO: compiled from: Token.kt */
        public interface Binary extends Operator {

            /* JADX INFO: compiled from: Token.kt */
            public interface Comparison extends Binary {

                /* JADX INFO: compiled from: Token.kt */
                public static final class Greater implements Comparison {

                    @NotNull
                    public static final Greater INSTANCE = new Greater();

                    private Greater() {
                    }

                    @NotNull
                    public String toString() {
                        return ">";
                    }
                }

                /* JADX INFO: compiled from: Token.kt */
                public static final class GreaterOrEqual implements Comparison {

                    @NotNull
                    public static final GreaterOrEqual INSTANCE = new GreaterOrEqual();

                    private GreaterOrEqual() {
                    }

                    @NotNull
                    public String toString() {
                        return ">=";
                    }
                }

                /* JADX INFO: compiled from: Token.kt */
                public static final class Less implements Comparison {

                    @NotNull
                    public static final Less INSTANCE = new Less();

                    private Less() {
                    }

                    @NotNull
                    public String toString() {
                        return "<";
                    }
                }

                /* JADX INFO: compiled from: Token.kt */
                public static final class LessOrEqual implements Comparison {

                    @NotNull
                    public static final LessOrEqual INSTANCE = new LessOrEqual();

                    private LessOrEqual() {
                    }

                    @NotNull
                    public String toString() {
                        return "<=";
                    }
                }
            }

            /* JADX INFO: compiled from: Token.kt */
            public interface Equality extends Binary {

                /* JADX INFO: compiled from: Token.kt */
                public static final class Equal implements Equality {

                    @NotNull
                    public static final Equal INSTANCE = new Equal();

                    private Equal() {
                    }

                    @NotNull
                    public String toString() {
                        return "==";
                    }
                }

                /* JADX INFO: compiled from: Token.kt */
                public static final class NotEqual implements Equality {

                    @NotNull
                    public static final NotEqual INSTANCE = new NotEqual();

                    private NotEqual() {
                    }

                    @NotNull
                    public String toString() {
                        return "!=";
                    }
                }
            }

            /* JADX INFO: compiled from: Token.kt */
            public interface Factor extends Binary {

                /* JADX INFO: compiled from: Token.kt */
                public static final class Division implements Factor {

                    @NotNull
                    public static final Division INSTANCE = new Division();

                    private Division() {
                    }

                    @NotNull
                    public String toString() {
                        return "/";
                    }
                }

                /* JADX INFO: compiled from: Token.kt */
                public static final class Modulo implements Factor {

                    @NotNull
                    public static final Modulo INSTANCE = new Modulo();

                    private Modulo() {
                    }

                    @NotNull
                    public String toString() {
                        return "%";
                    }
                }

                /* JADX INFO: compiled from: Token.kt */
                public static final class Multiplication implements Factor {

                    @NotNull
                    public static final Multiplication INSTANCE = new Multiplication();

                    private Multiplication() {
                    }

                    @NotNull
                    public String toString() {
                        return "*";
                    }
                }
            }

            /* JADX INFO: compiled from: Token.kt */
            public interface Logical extends Binary {

                /* JADX INFO: compiled from: Token.kt */
                public static final class And implements Logical {

                    @NotNull
                    public static final And INSTANCE = new And();

                    private And() {
                    }

                    @NotNull
                    public String toString() {
                        return "&&";
                    }
                }

                /* JADX INFO: compiled from: Token.kt */
                public static final class Or implements Logical {

                    @NotNull
                    public static final Or INSTANCE = new Or();

                    private Or() {
                    }

                    @NotNull
                    public String toString() {
                        return ImpressionLog.P;
                    }
                }
            }

            /* JADX INFO: compiled from: Token.kt */
            public static final class Power implements Binary {

                @NotNull
                public static final Power INSTANCE = new Power();

                private Power() {
                }

                @NotNull
                public String toString() {
                    return "^";
                }
            }

            /* JADX INFO: compiled from: Token.kt */
            public interface Sum extends Binary {

                /* JADX INFO: compiled from: Token.kt */
                public static final class Minus implements Sum {

                    @NotNull
                    public static final Minus INSTANCE = new Minus();

                    private Minus() {
                    }

                    @NotNull
                    public String toString() {
                        return "-";
                    }
                }

                /* JADX INFO: compiled from: Token.kt */
                public static final class Plus implements Sum {

                    @NotNull
                    public static final Plus INSTANCE = new Plus();

                    private Plus() {
                    }

                    @NotNull
                    public String toString() {
                        return "+";
                    }
                }
            }
        }

        /* JADX INFO: compiled from: Token.kt */
        public static final class Dot implements Operator {

            @NotNull
            public static final Dot INSTANCE = new Dot();

            private Dot() {
            }

            @NotNull
            public String toString() {
                return ".";
            }
        }

        /* JADX INFO: compiled from: Token.kt */
        public static final class TernaryElse implements Operator {

            @NotNull
            public static final TernaryElse INSTANCE = new TernaryElse();

            private TernaryElse() {
            }

            @NotNull
            public String toString() {
                return StringUtils.PROCESS_POSTFIX_DELIMITER;
            }
        }

        /* JADX INFO: compiled from: Token.kt */
        public static final class TernaryIf implements Operator {

            @NotNull
            public static final TernaryIf INSTANCE = new TernaryIf();

            private TernaryIf() {
            }

            @NotNull
            public String toString() {
                return "?";
            }
        }

        /* JADX INFO: compiled from: Token.kt */
        public static final class TernaryIfElse implements Operator {

            @NotNull
            public static final TernaryIfElse INSTANCE = new TernaryIfElse();

            private TernaryIfElse() {
            }
        }

        /* JADX INFO: compiled from: Token.kt */
        public static final class Try implements Operator {

            @NotNull
            public static final Try INSTANCE = new Try();

            private Try() {
            }

            @NotNull
            public String toString() {
                return "!:";
            }
        }

        /* JADX INFO: compiled from: Token.kt */
        public interface Unary extends Operator {

            /* JADX INFO: compiled from: Token.kt */
            public static final class Minus implements Unary {

                @NotNull
                public static final Minus INSTANCE = new Minus();

                private Minus() {
                }

                @NotNull
                public String toString() {
                    return "-";
                }
            }

            /* JADX INFO: compiled from: Token.kt */
            public static final class Not implements Unary {

                @NotNull
                public static final Not INSTANCE = new Not();

                private Not() {
                }

                @NotNull
                public String toString() {
                    return "!";
                }
            }

            /* JADX INFO: compiled from: Token.kt */
            public static final class Plus implements Unary {

                @NotNull
                public static final Plus INSTANCE = new Plus();

                private Plus() {
                }

                @NotNull
                public String toString() {
                    return "+";
                }
            }
        }
    }
}
