package com.yandex.div.evaluable;

import bn.r;
import cn.f0;
import cn.v;
import cn.w;
import cn.w0;
import cn.x;
import com.yandex.div.evaluable.function.GetBooleanValue;
import com.yandex.div.evaluable.function.GetColorValue;
import com.yandex.div.evaluable.function.GetColorValueString;
import com.yandex.div.evaluable.function.GetIntegerValue;
import com.yandex.div.evaluable.function.GetNumberValue;
import com.yandex.div.evaluable.function.GetStringValue;
import com.yandex.div.evaluable.function.GetUrlValueWithStringFallback;
import com.yandex.div.evaluable.function.GetUrlValueWithUrlFallback;
import com.yandex.div.evaluable.internal.Parser;
import com.yandex.div.evaluable.internal.Token;
import com.yandex.div.evaluable.internal.Tokenizer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: Evaluable.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class Evaluable {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final Set<String> functionsWithVariableName = w0.j(GetIntegerValue.INSTANCE.getName(), GetNumberValue.INSTANCE.getName(), GetStringValue.INSTANCE.getName(), GetColorValue.INSTANCE.getName(), GetColorValueString.INSTANCE.getName(), GetUrlValueWithUrlFallback.INSTANCE.getName(), GetUrlValueWithStringFallback.INSTANCE.getName(), GetBooleanValue.INSTANCE.getName());
    private boolean evalCalled;
    private boolean isCacheable;

    @NotNull
    private final String rawExpr;

    /* JADX INFO: compiled from: Evaluable.kt */
    public static final class Binary extends Evaluable {

        @NotNull
        private final List<Evaluable> dynamicVariables;

        @NotNull
        private final Evaluable left;

        @NotNull
        private final String rawExpression;

        @NotNull
        private final Evaluable right;

        @NotNull
        private final Token.Operator.Binary token;

        @NotNull
        private final List<String> variables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Binary(@NotNull Token.Operator.Binary binary, @NotNull Evaluable evaluable, @NotNull Evaluable evaluable2, @NotNull String str) {
            super(str);
            p.k(binary, "token");
            p.k(evaluable, "left");
            p.k(evaluable2, "right");
            p.k(str, "rawExpression");
            this.token = binary;
            this.left = evaluable;
            this.right = evaluable2;
            this.rawExpression = str;
            this.variables = f0.O0(evaluable.getVariables(), evaluable2.getVariables());
            this.dynamicVariables = f0.O0(evaluable.getDynamicVariables(), evaluable2.getDynamicVariables());
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Binary)) {
                return false;
            }
            Binary binary = (Binary) obj;
            return p.f(this.token, binary.token) && p.f(this.left, binary.left) && p.f(this.right, binary.right) && p.f(this.rawExpression, binary.rawExpression);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public Object evalImpl(@NotNull Evaluator evaluator) {
            p.k(evaluator, "evaluator");
            return evaluator.evalBinary$div_evaluable(this);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        @NotNull
        public final Evaluable getLeft() {
            return this.left;
        }

        @NotNull
        public final Evaluable getRight() {
            return this.right;
        }

        @NotNull
        public final Token.Operator.Binary getToken() {
            return this.token;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<String> getVariables() {
            return this.variables;
        }

        public int hashCode() {
            return (((((this.token.hashCode() * 31) + this.left.hashCode()) * 31) + this.right.hashCode()) * 31) + this.rawExpression.hashCode();
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('(');
            sb2.append(this.left);
            sb2.append(' ');
            sb2.append(this.token);
            sb2.append(' ');
            sb2.append(this.right);
            sb2.append(')');
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: Evaluable.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final Set<String> getFunctionsWithVariableName$div_evaluable() {
            return Evaluable.functionsWithVariableName;
        }

        @NotNull
        public final Evaluable lazy(@NotNull String str) {
            p.k(str, "expr");
            return new Lazy(str);
        }
    }

    /* JADX INFO: compiled from: Evaluable.kt */
    public static final class FunctionCall extends Evaluable {

        @NotNull
        private final List<Evaluable> arguments;

        @NotNull
        private final List<Evaluable> dynamicVariables;

        @NotNull
        private final String rawExpression;

        @NotNull
        private final Token.Function token;

        @NotNull
        private final List<String> variables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public FunctionCall(@NotNull Token.Function function, @NotNull List<? extends Evaluable> list, @NotNull String str) {
            Object obj;
            super(str);
            p.k(function, "token");
            p.k(list, "arguments");
            p.k(str, "rawExpression");
            this.token = function;
            this.arguments = list;
            this.rawExpression = str;
            ArrayList arrayList = new ArrayList(x.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Evaluable) it.next()).getVariables());
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                Object next = it2.next();
                while (it2.hasNext()) {
                    next = f0.O0((List) next, (List) it2.next());
                }
                obj = next;
            } else {
                obj = null;
            }
            List<String> list2 = (List) obj;
            this.variables = list2 == null ? w.m() : list2;
            this.dynamicVariables = findDynamicVariables();
        }

        private final List<Evaluable> findDynamicVariables() {
            Object obj;
            List<Evaluable> listM = Evaluable.Companion.getFunctionsWithVariableName$div_evaluable().contains(this.token.getName()) ? this.arguments : w.m();
            List<Evaluable> list = this.arguments;
            ArrayList arrayList = new ArrayList(x.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Evaluable) it.next()).getDynamicVariables());
            }
            Iterator it2 = f0.O0(arrayList, v.e(listM)).iterator();
            if (it2.hasNext()) {
                Object next = it2.next();
                while (it2.hasNext()) {
                    next = f0.O0((List) next, (List) it2.next());
                }
                obj = next;
            } else {
                obj = null;
            }
            List<Evaluable> list2 = (List) obj;
            return list2 == null ? w.m() : list2;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FunctionCall)) {
                return false;
            }
            FunctionCall functionCall = (FunctionCall) obj;
            return p.f(this.token, functionCall.token) && p.f(this.arguments, functionCall.arguments) && p.f(this.rawExpression, functionCall.rawExpression);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public Object evalImpl(@NotNull Evaluator evaluator) {
            p.k(evaluator, "evaluator");
            return evaluator.evalFunctionCall$div_evaluable(this);
        }

        @NotNull
        public final List<Evaluable> getArguments() {
            return this.arguments;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        @NotNull
        public final Token.Function getToken() {
            return this.token;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<String> getVariables() {
            return this.variables;
        }

        public int hashCode() {
            return (((this.token.hashCode() * 31) + this.arguments.hashCode()) * 31) + this.rawExpression.hashCode();
        }

        @NotNull
        public String toString() {
            return this.token.getName() + '(' + f0.D0(this.arguments, Token.Function.ArgumentDelimiter.INSTANCE.toString(), null, null, 0, null, null, 62, null) + ')';
        }
    }

    /* JADX INFO: compiled from: Evaluable.kt */
    public static final class Lazy extends Evaluable {

        @NotNull
        private final String expr;
        private Evaluable expression;

        @NotNull
        private final List<Token> tokens;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Lazy(@NotNull String str) {
            super(str);
            p.k(str, "expr");
            this.expr = str;
            this.tokens = Tokenizer.INSTANCE.tokenize(str);
        }

        private final void initExpression() {
            if (this.expression == null) {
                this.expression = Parser.INSTANCE.parse(this.tokens, getRawExpr());
            }
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public Object evalImpl(@NotNull Evaluator evaluator) {
            p.k(evaluator, "evaluator");
            initExpression();
            Evaluable evaluable = this.expression;
            Evaluable evaluable2 = null;
            if (evaluable == null) {
                p.C("expression");
                evaluable = null;
            }
            Object objEval$div_evaluable = evaluable.eval$div_evaluable(evaluator);
            Evaluable evaluable3 = this.expression;
            if (evaluable3 == null) {
                p.C("expression");
            } else {
                evaluable2 = evaluable3;
            }
            updateIsCacheable$div_evaluable(evaluable2.isCacheable);
            return objEval$div_evaluable;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<Evaluable> getDynamicVariables() {
            initExpression();
            r rVar = r.f5635a;
            Evaluable evaluable = this.expression;
            if (evaluable == null) {
                p.C("expression");
                evaluable = null;
            }
            return evaluable.getDynamicVariables();
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<String> getVariables() {
            Evaluable evaluable = this.expression;
            if (evaluable != null) {
                if (evaluable == null) {
                    p.C("expression");
                    evaluable = null;
                }
                return evaluable.getVariables();
            }
            List<Token> list = this.tokens;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof Token.Operand.Variable) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(x.x(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Token.Operand.Variable) it.next()).m7440unboximpl());
            }
            return arrayList2;
        }

        @NotNull
        public String toString() {
            return this.expr;
        }
    }

    /* JADX INFO: compiled from: Evaluable.kt */
    public static final class MethodCall extends Evaluable {

        @NotNull
        private final List<Evaluable> arguments;

        @NotNull
        private final List<Evaluable> dynamicVariables;

        @NotNull
        private final String rawExpression;

        @NotNull
        private final Token.Function token;

        @NotNull
        private final List<String> variables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public MethodCall(@NotNull Token.Function function, @NotNull List<? extends Evaluable> list, @NotNull String str) {
            Object next;
            super(str);
            p.k(function, "token");
            p.k(list, "arguments");
            p.k(str, "rawExpression");
            this.token = function;
            this.arguments = list;
            this.rawExpression = str;
            ArrayList arrayList = new ArrayList(x.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Evaluable) it.next()).getVariables());
            }
            Iterator it2 = arrayList.iterator();
            Object next2 = null;
            if (it2.hasNext()) {
                next = it2.next();
                while (it2.hasNext()) {
                    next = f0.O0((List) next, (List) it2.next());
                }
            } else {
                next = null;
            }
            List<String> list2 = (List) next;
            this.variables = list2 == null ? w.m() : list2;
            List<Evaluable> list3 = this.arguments;
            ArrayList arrayList2 = new ArrayList(x.x(list3, 10));
            Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((Evaluable) it3.next()).getDynamicVariables());
            }
            Iterator it4 = arrayList2.iterator();
            if (it4.hasNext()) {
                next2 = it4.next();
                while (it4.hasNext()) {
                    next2 = f0.O0((List) next2, (List) it4.next());
                }
            }
            List<Evaluable> list4 = (List) next2;
            this.dynamicVariables = list4 == null ? w.m() : list4;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MethodCall)) {
                return false;
            }
            MethodCall methodCall = (MethodCall) obj;
            return p.f(this.token, methodCall.token) && p.f(this.arguments, methodCall.arguments) && p.f(this.rawExpression, methodCall.rawExpression);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public Object evalImpl(@NotNull Evaluator evaluator) {
            p.k(evaluator, "evaluator");
            return evaluator.evalMethodCall$div_evaluable(this);
        }

        @NotNull
        public final List<Evaluable> getArguments() {
            return this.arguments;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        @NotNull
        public final Token.Function getToken() {
            return this.token;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<String> getVariables() {
            return this.variables;
        }

        public int hashCode() {
            return (((this.token.hashCode() * 31) + this.arguments.hashCode()) * 31) + this.rawExpression.hashCode();
        }

        @NotNull
        public String toString() {
            String strD0;
            if (this.arguments.size() > 1) {
                List<Evaluable> list = this.arguments;
                strD0 = f0.D0(list.subList(1, list.size()), Token.Function.ArgumentDelimiter.INSTANCE.toString(), null, null, 0, null, null, 62, null);
            } else {
                strD0 = "";
            }
            return f0.t0(this.arguments) + '.' + this.token.getName() + '(' + strD0 + ')';
        }
    }

    /* JADX INFO: compiled from: Evaluable.kt */
    public static final class StringTemplate extends Evaluable {

        @NotNull
        private final List<Evaluable> arguments;

        @NotNull
        private final List<Evaluable> dynamicVariables;

        @NotNull
        private final String rawExpression;

        @NotNull
        private final List<String> variables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public StringTemplate(@NotNull List<? extends Evaluable> list, @NotNull String str) {
            super(str);
            p.k(list, "arguments");
            p.k(str, "rawExpression");
            this.arguments = list;
            this.rawExpression = str;
            ArrayList arrayList = new ArrayList(x.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Evaluable) it.next()).getVariables());
            }
            Iterator it2 = arrayList.iterator();
            if (!it2.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it2.next();
            while (it2.hasNext()) {
                next = f0.O0((List) next, (List) it2.next());
            }
            this.variables = (List) next;
            List<Evaluable> list2 = this.arguments;
            ArrayList arrayList2 = new ArrayList(x.x(list2, 10));
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((Evaluable) it3.next()).getDynamicVariables());
            }
            Iterator it4 = arrayList2.iterator();
            if (!it4.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next2 = it4.next();
            while (it4.hasNext()) {
                next2 = f0.O0((List) next2, (List) it4.next());
            }
            this.dynamicVariables = (List) next2;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StringTemplate)) {
                return false;
            }
            StringTemplate stringTemplate = (StringTemplate) obj;
            return p.f(this.arguments, stringTemplate.arguments) && p.f(this.rawExpression, stringTemplate.rawExpression);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public Object evalImpl(@NotNull Evaluator evaluator) {
            p.k(evaluator, "evaluator");
            return evaluator.evalStringTemplate$div_evaluable(this);
        }

        @NotNull
        public final List<Evaluable> getArguments() {
            return this.arguments;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<String> getVariables() {
            return this.variables;
        }

        public int hashCode() {
            return (this.arguments.hashCode() * 31) + this.rawExpression.hashCode();
        }

        @NotNull
        public String toString() {
            return f0.D0(this.arguments, "", null, null, 0, null, null, 62, null);
        }
    }

    /* JADX INFO: compiled from: Evaluable.kt */
    public static final class Ternary extends Evaluable {

        @NotNull
        private final List<Evaluable> dynamicVariables;

        @NotNull
        private final Evaluable firstExpression;

        @NotNull
        private final String rawExpression;

        @NotNull
        private final Evaluable secondExpression;

        @NotNull
        private final Evaluable thirdExpression;

        @NotNull
        private final Token.Operator token;

        @NotNull
        private final List<String> variables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ternary(@NotNull Token.Operator operator, @NotNull Evaluable evaluable, @NotNull Evaluable evaluable2, @NotNull Evaluable evaluable3, @NotNull String str) {
            super(str);
            p.k(operator, "token");
            p.k(evaluable, "firstExpression");
            p.k(evaluable2, "secondExpression");
            p.k(evaluable3, "thirdExpression");
            p.k(str, "rawExpression");
            this.token = operator;
            this.firstExpression = evaluable;
            this.secondExpression = evaluable2;
            this.thirdExpression = evaluable3;
            this.rawExpression = str;
            this.variables = f0.O0(f0.O0(evaluable.getVariables(), evaluable2.getVariables()), evaluable3.getVariables());
            this.dynamicVariables = f0.O0(f0.O0(evaluable.getDynamicVariables(), evaluable2.getDynamicVariables()), evaluable3.getDynamicVariables());
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ternary)) {
                return false;
            }
            Ternary ternary = (Ternary) obj;
            return p.f(this.token, ternary.token) && p.f(this.firstExpression, ternary.firstExpression) && p.f(this.secondExpression, ternary.secondExpression) && p.f(this.thirdExpression, ternary.thirdExpression) && p.f(this.rawExpression, ternary.rawExpression);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public Object evalImpl(@NotNull Evaluator evaluator) {
            p.k(evaluator, "evaluator");
            return evaluator.evalTernary$div_evaluable(this);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        @NotNull
        public final Evaluable getFirstExpression() {
            return this.firstExpression;
        }

        @NotNull
        public final Evaluable getSecondExpression() {
            return this.secondExpression;
        }

        @NotNull
        public final Evaluable getThirdExpression() {
            return this.thirdExpression;
        }

        @NotNull
        public final Token.Operator getToken() {
            return this.token;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<String> getVariables() {
            return this.variables;
        }

        public int hashCode() {
            return (((((((this.token.hashCode() * 31) + this.firstExpression.hashCode()) * 31) + this.secondExpression.hashCode()) * 31) + this.thirdExpression.hashCode()) * 31) + this.rawExpression.hashCode();
        }

        @NotNull
        public String toString() {
            Token.Operator.TernaryIf ternaryIf = Token.Operator.TernaryIf.INSTANCE;
            Token.Operator.TernaryElse ternaryElse = Token.Operator.TernaryElse.INSTANCE;
            StringBuilder sb2 = new StringBuilder();
            sb2.append('(');
            sb2.append(this.firstExpression);
            sb2.append(' ');
            sb2.append(ternaryIf);
            sb2.append(' ');
            sb2.append(this.secondExpression);
            sb2.append(' ');
            sb2.append(ternaryElse);
            sb2.append(' ');
            sb2.append(this.thirdExpression);
            sb2.append(')');
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: Evaluable.kt */
    public static final class Try extends Evaluable {

        @NotNull
        private final List<Evaluable> dynamicVariables;

        @NotNull
        private final Evaluable fallbackExpression;

        @NotNull
        private final String rawExpression;

        @NotNull
        private final Token.Operator.Try token;

        @NotNull
        private final Evaluable tryExpression;

        @NotNull
        private final List<String> variables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Try(@NotNull Token.Operator.Try r22, @NotNull Evaluable evaluable, @NotNull Evaluable evaluable2, @NotNull String str) {
            super(str);
            p.k(r22, "token");
            p.k(evaluable, "tryExpression");
            p.k(evaluable2, "fallbackExpression");
            p.k(str, "rawExpression");
            this.token = r22;
            this.tryExpression = evaluable;
            this.fallbackExpression = evaluable2;
            this.rawExpression = str;
            this.variables = f0.O0(evaluable.getVariables(), evaluable2.getVariables());
            this.dynamicVariables = f0.O0(evaluable.getDynamicVariables(), evaluable2.getDynamicVariables());
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Try)) {
                return false;
            }
            Try r52 = (Try) obj;
            return p.f(this.token, r52.token) && p.f(this.tryExpression, r52.tryExpression) && p.f(this.fallbackExpression, r52.fallbackExpression) && p.f(this.rawExpression, r52.rawExpression);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public Object evalImpl(@NotNull Evaluator evaluator) {
            p.k(evaluator, "evaluator");
            return evaluator.evalTry$div_evaluable(this);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        @NotNull
        public final Evaluable getFallbackExpression() {
            return this.fallbackExpression;
        }

        @NotNull
        public final Evaluable getTryExpression() {
            return this.tryExpression;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<String> getVariables() {
            return this.variables;
        }

        public int hashCode() {
            return (((((this.token.hashCode() * 31) + this.tryExpression.hashCode()) * 31) + this.fallbackExpression.hashCode()) * 31) + this.rawExpression.hashCode();
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('(');
            sb2.append(this.tryExpression);
            sb2.append(' ');
            sb2.append(this.token);
            sb2.append(' ');
            sb2.append(this.fallbackExpression);
            sb2.append(')');
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: Evaluable.kt */
    public static final class Unary extends Evaluable {

        @NotNull
        private final List<Evaluable> dynamicVariables;

        @NotNull
        private final Evaluable expression;

        @NotNull
        private final String rawExpression;

        @NotNull
        private final Token.Operator token;

        @NotNull
        private final List<String> variables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unary(@NotNull Token.Operator operator, @NotNull Evaluable evaluable, @NotNull String str) {
            super(str);
            p.k(operator, "token");
            p.k(evaluable, "expression");
            p.k(str, "rawExpression");
            this.token = operator;
            this.expression = evaluable;
            this.rawExpression = str;
            this.variables = evaluable.getVariables();
            this.dynamicVariables = evaluable.getDynamicVariables();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Unary)) {
                return false;
            }
            Unary unary = (Unary) obj;
            return p.f(this.token, unary.token) && p.f(this.expression, unary.expression) && p.f(this.rawExpression, unary.rawExpression);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public Object evalImpl(@NotNull Evaluator evaluator) {
            p.k(evaluator, "evaluator");
            return evaluator.evalUnary$div_evaluable(this);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        @NotNull
        public final Evaluable getExpression() {
            return this.expression;
        }

        @NotNull
        public final Token.Operator getToken() {
            return this.token;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<String> getVariables() {
            return this.variables;
        }

        public int hashCode() {
            return (((this.token.hashCode() * 31) + this.expression.hashCode()) * 31) + this.rawExpression.hashCode();
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.token);
            sb2.append(this.expression);
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: Evaluable.kt */
    public static final class Value extends Evaluable {

        @NotNull
        private final List<Evaluable> dynamicVariables;

        @NotNull
        private final String rawExpression;

        @NotNull
        private final Token.Operand.Literal token;

        @NotNull
        private final List<String> variables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Value(@NotNull Token.Operand.Literal literal, @NotNull String str) {
            super(str);
            p.k(literal, "token");
            p.k(str, "rawExpression");
            this.token = literal;
            this.rawExpression = str;
            this.variables = w.m();
            this.dynamicVariables = w.m();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Value)) {
                return false;
            }
            Value value = (Value) obj;
            return p.f(this.token, value.token) && p.f(this.rawExpression, value.rawExpression);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public Object evalImpl(@NotNull Evaluator evaluator) {
            p.k(evaluator, "evaluator");
            return evaluator.evalValue$div_evaluable(this);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        @NotNull
        public final Token.Operand.Literal getToken() {
            return this.token;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<String> getVariables() {
            return this.variables;
        }

        public int hashCode() {
            return (this.token.hashCode() * 31) + this.rawExpression.hashCode();
        }

        @NotNull
        public String toString() {
            Token.Operand.Literal literal = this.token;
            if (literal instanceof Token.Operand.Literal.Str) {
                return '\'' + ((Token.Operand.Literal.Str) this.token).m7433unboximpl() + '\'';
            }
            if (literal instanceof Token.Operand.Literal.Num) {
                return ((Token.Operand.Literal.Num) literal).m7427unboximpl().toString();
            }
            if (literal instanceof Token.Operand.Literal.Bool) {
                return String.valueOf(((Token.Operand.Literal.Bool) literal).m7421unboximpl());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: compiled from: Evaluable.kt */
    public static final class Variable extends Evaluable {

        @NotNull
        private final List<Evaluable> dynamicVariables;

        @NotNull
        private final String rawExpression;

        @NotNull
        private final String token;

        @NotNull
        private final List<String> variables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private Variable(String str, String str2) {
            super(str2);
            p.k(str, "token");
            p.k(str2, "rawExpression");
            this.token = str;
            this.rawExpression = str2;
            this.variables = v.e(str);
            this.dynamicVariables = w.m();
        }

        public /* synthetic */ Variable(String str, String str2, i iVar) {
            this(str, str2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Variable)) {
                return false;
            }
            Variable variable = (Variable) obj;
            return Token.Operand.Variable.m7437equalsimpl0(this.token, variable.token) && p.f(this.rawExpression, variable.rawExpression);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public Object evalImpl(@NotNull Evaluator evaluator) {
            p.k(evaluator, "evaluator");
            return evaluator.evalVariable$div_evaluable(this);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        @NotNull
        /* JADX INFO: renamed from: getToken-A4lXSVo, reason: not valid java name */
        public final String m7401getTokenA4lXSVo() {
            return this.token;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<String> getVariables() {
            return this.variables;
        }

        public int hashCode() {
            return (Token.Operand.Variable.m7438hashCodeimpl(this.token) * 31) + this.rawExpression.hashCode();
        }

        @NotNull
        public String toString() {
            return this.token;
        }
    }

    public Evaluable(@NotNull String str) {
        p.k(str, "rawExpr");
        this.rawExpr = str;
        this.isCacheable = true;
    }

    public final boolean checkIsCacheable() {
        return this.isCacheable;
    }

    @NotNull
    public final Object eval$div_evaluable(@NotNull Evaluator evaluator) throws EvaluableException {
        p.k(evaluator, "evaluator");
        Object objEvalImpl = evalImpl(evaluator);
        this.evalCalled = true;
        return objEvalImpl;
    }

    @NotNull
    public abstract Object evalImpl(@NotNull Evaluator evaluator) throws EvaluableException;

    @NotNull
    public abstract List<Evaluable> getDynamicVariables();

    @NotNull
    public final String getRawExpr() {
        return this.rawExpr;
    }

    @NotNull
    public abstract List<String> getVariables();

    public final void updateIsCacheable$div_evaluable(boolean z10) {
        this.isCacheable = this.isCacheable && z10;
    }
}
