package com.yandex.div.core.view2.errors;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: VariableMonitorView.kt */
/* JADX INFO: loaded from: classes4.dex */
final class VariableModel {

    @NotNull
    private final String name;

    @NotNull
    private final String path;

    @NotNull
    private final String type;

    @NotNull
    private final String value;

    public VariableModel(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        this.name = str;
        this.path = str2;
        this.type = str3;
        this.value = str4;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VariableModel)) {
            return false;
        }
        VariableModel variableModel = (VariableModel) obj;
        return p.f(this.name, variableModel.name) && p.f(this.path, variableModel.path) && p.f(this.type, variableModel.type) && p.f(this.value, variableModel.value);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.path.hashCode()) * 31) + this.type.hashCode()) * 31) + this.value.hashCode();
    }

    @NotNull
    public String toString() {
        return "VariableModel(name=" + this.name + ", path=" + this.path + ", type=" + this.type + ", value=" + this.value + ')';
    }
}
