package com.yandex.div.evaluable;

import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import tn.i;

/* JADX INFO: compiled from: EvaluableType.kt */
/* JADX INFO: loaded from: classes10.dex */
public enum EvaluableType {
    INTEGER("Integer"),
    NUMBER("Number"),
    BOOLEAN("Boolean"),
    STRING("String"),
    DATETIME(ExifInterface.TAG_DATETIME),
    COLOR("Color"),
    URL("Url"),
    DICT("Dict"),
    ARRAY("Array");


    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String typeName;

    /* JADX INFO: compiled from: EvaluableType.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    EvaluableType(String str) {
        this.typeName = str;
    }

    @NotNull
    public final String getTypeName$div_evaluable() {
        return this.typeName;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.typeName;
    }
}
