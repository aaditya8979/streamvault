package com.yandex.div.core.view2;

import bn.g;
import kotlin.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import tn.p;

/* JADX INFO: compiled from: CompositeLogId.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class CompositeLogId {

    @NotNull
    private final String actionLogId;

    @NotNull
    private final g compositeLogId$delegate = b.b(new a<String>() { // from class: com.yandex.div.core.view2.CompositeLogId$compositeLogId$2
        {
            super(0);
        }

        @Override // sn.a
        @NotNull
        public final String invoke() {
            return this.this$0.formatCompositeLogId();
        }
    });

    @NotNull
    private final String dataTag;

    @NotNull
    private final String scopeLogId;

    public CompositeLogId(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        this.dataTag = str;
        this.scopeLogId = str2;
        this.actionLogId = str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String formatCompositeLogId() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.dataTag);
        if (this.scopeLogId.length() > 0) {
            str = '#' + this.scopeLogId;
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append('#');
        sb2.append(this.actionLogId);
        return sb2.toString();
    }

    private final String getCompositeLogId() {
        return (String) this.compositeLogId$delegate.getValue();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeLogId)) {
            return false;
        }
        CompositeLogId compositeLogId = (CompositeLogId) obj;
        return p.f(this.dataTag, compositeLogId.dataTag) && p.f(this.scopeLogId, compositeLogId.scopeLogId) && p.f(this.actionLogId, compositeLogId.actionLogId);
    }

    public int hashCode() {
        return (((this.dataTag.hashCode() * 31) + this.scopeLogId.hashCode()) * 31) + this.actionLogId.hashCode();
    }

    @NotNull
    public String toString() {
        return getCompositeLogId();
    }
}
