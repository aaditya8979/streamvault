package com.yandex.div.data;

import android.net.Uri;
import androidx.annotation.MainThread;
import bn.r;
import bo.d0;
import com.yandex.div.core.ObserverList;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.util.ConvertUtilsKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.BoolVariable;
import com.yandex.div2.NumberVariable;
import com.yandex.div2.StrVariable;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sn.l;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: Variable.kt */
/* JADX INFO: loaded from: classes10.dex */
public abstract class Variable {

    @NotNull
    private final ObserverList<l<Variable, r>> observers;

    /* JADX INFO: compiled from: Variable.kt */
    public static class ArrayVariable extends Variable {

        @NotNull
        private final JSONArray defaultValue;

        @NotNull
        private final String name;

        @NotNull
        private JSONArray value;

        public ArrayVariable(@NotNull String str, @NotNull JSONArray jSONArray) {
            super(null);
            this.name = str;
            this.defaultValue = jSONArray;
            this.value = getDefaultValue();
        }

        @NotNull
        public JSONArray getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.yandex.div.data.Variable
        @NotNull
        public String getName() {
            return this.name;
        }

        @NotNull
        public JSONArray getValue$div_data_release() {
            return this.value;
        }

        @MainThread
        public void set(@NotNull JSONArray jSONArray) {
            setValue$div_data_release(jSONArray);
        }

        public void setValue$div_data_release(@NotNull JSONArray jSONArray) {
            if (p.f(this.value, jSONArray)) {
                return;
            }
            this.value = jSONArray;
            notifyVariableChanged(this);
        }
    }

    /* JADX INFO: compiled from: Variable.kt */
    public static class BooleanVariable extends Variable {
        private final boolean defaultValue;

        @NotNull
        private final String name;
        private boolean value;

        public BooleanVariable(@NotNull String str, boolean z10) {
            super(null);
            this.name = str;
            this.defaultValue = z10;
            this.value = getDefaultValue();
        }

        public boolean getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.yandex.div.data.Variable
        @NotNull
        public String getName() {
            return this.name;
        }

        public boolean getValue$div_data_release() {
            return this.value;
        }

        @MainThread
        public void set(boolean z10) {
            setValue$div_data_release(z10);
        }

        public void setValue$div_data_release(boolean z10) {
            if (this.value == z10) {
                return;
            }
            this.value = z10;
            notifyVariableChanged(this);
        }
    }

    /* JADX INFO: compiled from: Variable.kt */
    public static class ColorVariable extends Variable {
        private final int defaultValue;

        @NotNull
        private final String name;
        private int value;

        public ColorVariable(@NotNull String str, int i10) {
            super(null);
            this.name = str;
            this.defaultValue = i10;
            this.value = Color.m7445constructorimpl(getDefaultValue());
        }

        public int getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.yandex.div.data.Variable
        @NotNull
        public String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: getValue-WpymAT4$div_data_release, reason: not valid java name */
        public int m7398getValueWpymAT4$div_data_release() {
            return this.value;
        }

        @MainThread
        /* JADX INFO: renamed from: set-cIhhviA, reason: not valid java name */
        public void m7399setcIhhviA(int i10) throws VariableMutationException {
            Integer numInvoke = ParsingConvertersKt.STRING_TO_COLOR_INT.invoke(Color.m7444boximpl(i10));
            if (numInvoke != null) {
                m7400setValuecIhhviA$div_data_release(Color.m7445constructorimpl(numInvoke.intValue()));
                return;
            }
            throw new VariableMutationException("Wrong value format for color variable: '" + ((Object) Color.m7451toStringimpl(i10)) + '\'', null, 2, null);
        }

        /* JADX INFO: renamed from: setValue-cIhhviA$div_data_release, reason: not valid java name */
        public void m7400setValuecIhhviA$div_data_release(int i10) {
            if (Color.m7447equalsimpl0(this.value, i10)) {
                return;
            }
            this.value = i10;
            notifyVariableChanged(this);
        }
    }

    /* JADX INFO: compiled from: Variable.kt */
    public static class DictVariable extends Variable {

        @NotNull
        private final JSONObject defaultValue;

        @NotNull
        private final String name;

        @NotNull
        private JSONObject value;

        public DictVariable(@NotNull String str, @NotNull JSONObject jSONObject) {
            super(null);
            this.name = str;
            this.defaultValue = jSONObject;
            this.value = getDefaultValue();
        }

        @NotNull
        public JSONObject getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.yandex.div.data.Variable
        @NotNull
        public String getName() {
            return this.name;
        }

        @NotNull
        public JSONObject getValue$div_data_release() {
            return this.value;
        }

        @MainThread
        public void set(@NotNull JSONObject jSONObject) {
            setValue$div_data_release(jSONObject);
        }

        public void setValue$div_data_release(@NotNull JSONObject jSONObject) {
            if (p.f(this.value, jSONObject)) {
                return;
            }
            this.value = jSONObject;
            notifyVariableChanged(this);
        }
    }

    /* JADX INFO: compiled from: Variable.kt */
    public static class DoubleVariable extends Variable {
        private final double defaultValue;

        @NotNull
        private final String name;
        private double value;

        public DoubleVariable(@NotNull String str, double d10) {
            super(null);
            this.name = str;
            this.defaultValue = d10;
            this.value = getDefaultValue();
        }

        public double getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.yandex.div.data.Variable
        @NotNull
        public String getName() {
            return this.name;
        }

        public double getValue$div_data_release() {
            return this.value;
        }

        @MainThread
        public void set(double d10) {
            setValue$div_data_release(d10);
        }

        public void setValue$div_data_release(double d10) {
            if (this.value == d10) {
                return;
            }
            this.value = d10;
            notifyVariableChanged(this);
        }
    }

    /* JADX INFO: compiled from: Variable.kt */
    public static class IntegerVariable extends Variable {
        private final long defaultValue;

        @NotNull
        private final String name;
        private long value;

        public IntegerVariable(@NotNull String str, long j10) {
            super(null);
            this.name = str;
            this.defaultValue = j10;
            this.value = getDefaultValue();
        }

        public long getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.yandex.div.data.Variable
        @NotNull
        public String getName() {
            return this.name;
        }

        public long getValue$div_data_release() {
            return this.value;
        }

        @MainThread
        public void set(long j10) {
            setValue$div_data_release(j10);
        }

        public void setValue$div_data_release(long j10) {
            if (this.value == j10) {
                return;
            }
            this.value = j10;
            notifyVariableChanged(this);
        }
    }

    /* JADX INFO: compiled from: Variable.kt */
    public static class StringVariable extends Variable {

        @NotNull
        private final String defaultValue;

        @NotNull
        private final String name;

        @NotNull
        private String value;

        public StringVariable(@NotNull String str, @NotNull String str2) {
            super(null);
            this.name = str;
            this.defaultValue = str2;
            this.value = getDefaultValue();
        }

        @NotNull
        public String getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.yandex.div.data.Variable
        @NotNull
        public String getName() {
            return this.name;
        }

        @NotNull
        public String getValue$div_data_release() {
            return this.value;
        }

        public void setValue$div_data_release(@NotNull String str) {
            if (p.f(this.value, str)) {
                return;
            }
            this.value = str;
            notifyVariableChanged(this);
        }
    }

    /* JADX INFO: compiled from: Variable.kt */
    public static class UrlVariable extends Variable {

        @NotNull
        private final Uri defaultValue;

        @NotNull
        private final String name;

        @NotNull
        private Uri value;

        public UrlVariable(@NotNull String str, @NotNull Uri uri) {
            super(null);
            this.name = str;
            this.defaultValue = uri;
            this.value = getDefaultValue();
        }

        @NotNull
        public Uri getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.yandex.div.data.Variable
        @NotNull
        public String getName() {
            return this.name;
        }

        @NotNull
        public Uri getValue$div_data_release() {
            return this.value;
        }

        @MainThread
        public void set(@NotNull Uri uri) {
            setValue$div_data_release(uri);
        }

        public void setValue$div_data_release(@NotNull Uri uri) {
            if (p.f(this.value, uri)) {
                return;
            }
            this.value = uri;
            notifyVariableChanged(this);
        }
    }

    private Variable() {
        this.observers = new ObserverList<>();
    }

    public /* synthetic */ Variable(i iVar) {
        this();
    }

    private boolean parseAsBoolean(String str) {
        Boolean boolR1 = d0.r1(str);
        if (boolR1 != null || (boolR1 = ConvertUtilsKt.toBoolean(parseAsInt(str))) != null) {
            return boolR1.booleanValue();
        }
        throw new VariableMutationException("Unable to convert " + str + " to boolean", null, 2, null);
    }

    /* JADX INFO: renamed from: parseAsColor-C4zCDoM, reason: not valid java name */
    private int m7397parseAsColorC4zCDoM(String str) {
        Integer numInvoke = ParsingConvertersKt.STRING_TO_COLOR_INT.invoke(str);
        if (numInvoke != null) {
            return Color.m7445constructorimpl(numInvoke.intValue());
        }
        throw new VariableMutationException("Wrong value format for color variable: '" + str + '\'', null, 2, null);
    }

    private double parseAsDouble(String str) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException e10) {
            throw new VariableMutationException(null, e10, 1, null);
        }
    }

    private int parseAsInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e10) {
            throw new VariableMutationException(null, e10, 1, null);
        }
    }

    private JSONArray parseAsJsonArray(String str) {
        try {
            return new JSONArray(str);
        } catch (JSONException e10) {
            throw new VariableMutationException(null, e10, 1, null);
        }
    }

    private JSONObject parseAsJsonObject(String str) {
        try {
            return new JSONObject(str);
        } catch (JSONException e10) {
            throw new VariableMutationException(null, e10, 1, null);
        }
    }

    private long parseAsLong(String str) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e10) {
            throw new VariableMutationException(null, e10, 1, null);
        }
    }

    private Uri parseAsUri(String str) {
        try {
            return Uri.parse(str);
        } catch (IllegalArgumentException e10) {
            throw new VariableMutationException(null, e10, 1, null);
        }
    }

    public void addObserver(@NotNull l<? super Variable, r> lVar) {
        this.observers.addObserver(lVar);
    }

    @NotNull
    public abstract String getName();

    @NotNull
    public Object getValue() {
        if (this instanceof StringVariable) {
            return ((StringVariable) this).getValue$div_data_release();
        }
        if (this instanceof IntegerVariable) {
            return Long.valueOf(((IntegerVariable) this).getValue$div_data_release());
        }
        if (this instanceof BooleanVariable) {
            return Boolean.valueOf(((BooleanVariable) this).getValue$div_data_release());
        }
        if (this instanceof DoubleVariable) {
            return Double.valueOf(((DoubleVariable) this).getValue$div_data_release());
        }
        if (this instanceof ColorVariable) {
            return Color.m7444boximpl(((ColorVariable) this).m7398getValueWpymAT4$div_data_release());
        }
        if (this instanceof UrlVariable) {
            return ((UrlVariable) this).getValue$div_data_release();
        }
        if (this instanceof DictVariable) {
            return ((DictVariable) this).getValue$div_data_release();
        }
        if (this instanceof ArrayVariable) {
            return ((ArrayVariable) this).getValue$div_data_release();
        }
        throw new NoWhenBranchMatchedException();
    }

    public void notifyVariableChanged(@NotNull Variable variable) {
        Assert.assertMainThread();
        Iterator<l<Variable, r>> it = this.observers.iterator();
        while (it.hasNext()) {
            it.next().invoke(variable);
        }
    }

    public void removeObserver(@NotNull l<? super Variable, r> lVar) {
        this.observers.removeObserver(lVar);
    }

    @MainThread
    public void set(@NotNull String str) throws VariableMutationException {
        if (this instanceof StringVariable) {
            ((StringVariable) this).setValue$div_data_release(str);
            return;
        }
        if (this instanceof IntegerVariable) {
            ((IntegerVariable) this).setValue$div_data_release(parseAsLong(str));
            return;
        }
        if (this instanceof BooleanVariable) {
            ((BooleanVariable) this).setValue$div_data_release(parseAsBoolean(str));
            return;
        }
        if (this instanceof DoubleVariable) {
            ((DoubleVariable) this).setValue$div_data_release(parseAsDouble(str));
            return;
        }
        if (this instanceof ColorVariable) {
            ((ColorVariable) this).m7400setValuecIhhviA$div_data_release(m7397parseAsColorC4zCDoM(str));
            return;
        }
        if (this instanceof UrlVariable) {
            ((UrlVariable) this).setValue$div_data_release(parseAsUri(str));
        } else if (this instanceof DictVariable) {
            ((DictVariable) this).setValue$div_data_release(parseAsJsonObject(str));
        } else {
            if (!(this instanceof ArrayVariable)) {
                throw new NoWhenBranchMatchedException();
            }
            ((ArrayVariable) this).setValue$div_data_release(parseAsJsonArray(str));
        }
    }

    @MainThread
    public void setValue(@NotNull Variable variable) throws VariableMutationException {
        if ((this instanceof StringVariable) && (variable instanceof StringVariable)) {
            ((StringVariable) this).setValue$div_data_release(((StringVariable) variable).getValue$div_data_release());
            return;
        }
        if ((this instanceof IntegerVariable) && (variable instanceof IntegerVariable)) {
            ((IntegerVariable) this).setValue$div_data_release(((IntegerVariable) variable).getValue$div_data_release());
            return;
        }
        if ((this instanceof BooleanVariable) && (variable instanceof BooleanVariable)) {
            ((BooleanVariable) this).setValue$div_data_release(((BooleanVariable) variable).getValue$div_data_release());
            return;
        }
        if ((this instanceof DoubleVariable) && (variable instanceof DoubleVariable)) {
            ((DoubleVariable) this).setValue$div_data_release(((DoubleVariable) variable).getValue$div_data_release());
            return;
        }
        if ((this instanceof ColorVariable) && (variable instanceof ColorVariable)) {
            ((ColorVariable) this).m7400setValuecIhhviA$div_data_release(((ColorVariable) variable).m7398getValueWpymAT4$div_data_release());
            return;
        }
        if ((this instanceof UrlVariable) && (variable instanceof UrlVariable)) {
            ((UrlVariable) this).setValue$div_data_release(((UrlVariable) variable).getValue$div_data_release());
            return;
        }
        if ((this instanceof DictVariable) && (variable instanceof DictVariable)) {
            ((DictVariable) this).setValue$div_data_release(((DictVariable) variable).getValue$div_data_release());
            return;
        }
        if ((this instanceof ArrayVariable) && (variable instanceof ArrayVariable)) {
            ((ArrayVariable) this).setValue$div_data_release(((ArrayVariable) variable).getValue$div_data_release());
            return;
        }
        throw new VariableMutationException("Setting value to " + this + " from " + variable + " not supported!", null, 2, null);
    }

    @MainThread
    public void setValueDirectly(@NotNull Object obj) throws VariableMutationException {
        try {
            if (this instanceof StringVariable) {
                p.i(obj, "null cannot be cast to non-null type kotlin.String");
                ((StringVariable) this).setValue$div_data_release((String) obj);
                return;
            }
            if (this instanceof IntegerVariable) {
                p.i(obj, "null cannot be cast to non-null type kotlin.Number");
                ((IntegerVariable) this).setValue$div_data_release(((Number) obj).longValue());
                return;
            }
            if (this instanceof BooleanVariable) {
                p.i(obj, "null cannot be cast to non-null type kotlin.Boolean");
                ((BooleanVariable) this).setValue$div_data_release(((Boolean) obj).booleanValue());
                return;
            }
            if (this instanceof DoubleVariable) {
                p.i(obj, "null cannot be cast to non-null type kotlin.Number");
                ((DoubleVariable) this).setValue$div_data_release(((Number) obj).doubleValue());
                return;
            }
            if (this instanceof ColorVariable) {
                p.i(obj, "null cannot be cast to non-null type com.yandex.div.evaluable.types.Color");
                ((ColorVariable) this).m7400setValuecIhhviA$div_data_release(((Color) obj).m7452unboximpl());
                return;
            }
            if (this instanceof UrlVariable) {
                p.i(obj, "null cannot be cast to non-null type android.net.Uri");
                ((UrlVariable) this).setValue$div_data_release((Uri) obj);
            } else if (this instanceof DictVariable) {
                p.i(obj, "null cannot be cast to non-null type org.json.JSONObject");
                ((DictVariable) this).setValue$div_data_release((JSONObject) obj);
            } else {
                if (!(this instanceof ArrayVariable)) {
                    throw new NoWhenBranchMatchedException();
                }
                p.i(obj, "null cannot be cast to non-null type org.json.JSONArray");
                ((ArrayVariable) this).setValue$div_data_release((JSONArray) obj);
            }
        } catch (ClassCastException unused) {
            throw new VariableMutationException("Unable to set value with type " + obj.getClass() + " to " + this, null, 2, null);
        }
    }

    @NotNull
    public JSONObject writeToJSON() {
        JSONSerializable urlVariable;
        if (this instanceof ArrayVariable) {
            urlVariable = new com.yandex.div2.ArrayVariable(getName(), Expression.Companion.constant$default(Expression.Companion, ((ArrayVariable) this).getValue$div_data_release(), null, 2, null));
        } else if (this instanceof BooleanVariable) {
            urlVariable = new BoolVariable(getName(), Expression.Companion.constant$default(Expression.Companion, Boolean.valueOf(((BooleanVariable) this).getValue$div_data_release()), null, 2, null));
        } else if (this instanceof ColorVariable) {
            urlVariable = new com.yandex.div2.ColorVariable(getName(), Expression.Companion.constant$default(Expression.Companion, Integer.valueOf(((ColorVariable) this).m7398getValueWpymAT4$div_data_release()), null, 2, null));
        } else if (this instanceof DictVariable) {
            urlVariable = new com.yandex.div2.DictVariable(getName(), Expression.Companion.constant$default(Expression.Companion, ((DictVariable) this).getValue$div_data_release(), null, 2, null));
        } else if (this instanceof DoubleVariable) {
            urlVariable = new NumberVariable(getName(), Expression.Companion.constant$default(Expression.Companion, Double.valueOf(((DoubleVariable) this).getValue$div_data_release()), null, 2, null));
        } else if (this instanceof IntegerVariable) {
            urlVariable = new com.yandex.div2.IntegerVariable(getName(), Expression.Companion.constant$default(Expression.Companion, Long.valueOf(((IntegerVariable) this).getValue$div_data_release()), null, 2, null));
        } else if (this instanceof StringVariable) {
            urlVariable = new StrVariable(getName(), Expression.Companion.constant$default(Expression.Companion, ((StringVariable) this).getValue$div_data_release(), null, 2, null));
        } else {
            if (!(this instanceof UrlVariable)) {
                throw new NoWhenBranchMatchedException();
            }
            urlVariable = new com.yandex.div2.UrlVariable(getName(), Expression.Companion.constant$default(Expression.Companion, ((UrlVariable) this).getValue$div_data_release(), null, 2, null));
        }
        return urlVariable.writeToJSON();
    }
}
