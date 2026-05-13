package com.yandex.div.internal.parser;

import android.net.Uri;
import androidx.core.view.ViewCompat;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: TypeHelpers.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class TypeHelpersKt {

    @NotNull
    public static final TypeHelper<Boolean> TYPE_HELPER_BOOLEAN = new TypeHelper<Boolean>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_BOOLEAN$1
        private final boolean typeDefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.yandex.div.internal.parser.TypeHelper
        @NotNull
        public Boolean getTypeDefault() {
            return Boolean.valueOf(this.typeDefault);
        }

        @Override // com.yandex.div.internal.parser.TypeHelper
        public boolean isTypeValid(@NotNull Object obj) {
            return obj instanceof Boolean;
        }
    };

    @NotNull
    public static final TypeHelper<Long> TYPE_HELPER_INT = new TypeHelper<Long>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_INT$1
        private final long typeDefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.yandex.div.internal.parser.TypeHelper
        @NotNull
        public Long getTypeDefault() {
            return Long.valueOf(this.typeDefault);
        }

        @Override // com.yandex.div.internal.parser.TypeHelper
        public boolean isTypeValid(@NotNull Object obj) {
            return obj instanceof Long;
        }
    };

    @NotNull
    public static final TypeHelper<String> TYPE_HELPER_STRING = new TypeHelper<String>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_STRING$1

        @NotNull
        private final String typeDefault = "";

        @Override // com.yandex.div.internal.parser.TypeHelper
        @NotNull
        public String getTypeDefault() {
            return this.typeDefault;
        }

        @Override // com.yandex.div.internal.parser.TypeHelper
        public boolean isTypeValid(@NotNull Object obj) {
            return obj instanceof String;
        }
    };

    @NotNull
    public static final TypeHelper<Double> TYPE_HELPER_DOUBLE = new TypeHelper<Double>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_DOUBLE$1
        private final double typeDefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.yandex.div.internal.parser.TypeHelper
        @NotNull
        public Double getTypeDefault() {
            return Double.valueOf(this.typeDefault);
        }

        @Override // com.yandex.div.internal.parser.TypeHelper
        public boolean isTypeValid(@NotNull Object obj) {
            return obj instanceof Double;
        }
    };

    @NotNull
    public static final TypeHelper<Uri> TYPE_HELPER_URI = new TypeHelper<Uri>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_URI$1
        private final Uri typeDefault = Uri.EMPTY;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.yandex.div.internal.parser.TypeHelper
        public Uri getTypeDefault() {
            return this.typeDefault;
        }

        @Override // com.yandex.div.internal.parser.TypeHelper
        public boolean isTypeValid(@NotNull Object obj) {
            return obj instanceof Uri;
        }
    };

    @NotNull
    public static final TypeHelper<Integer> TYPE_HELPER_COLOR = new TypeHelper<Integer>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_COLOR$1
        private final int typeDefault = ViewCompat.MEASURED_STATE_MASK;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.yandex.div.internal.parser.TypeHelper
        @NotNull
        public Integer getTypeDefault() {
            return Integer.valueOf(this.typeDefault);
        }

        @Override // com.yandex.div.internal.parser.TypeHelper
        public boolean isTypeValid(@NotNull Object obj) {
            return obj instanceof Integer;
        }
    };

    @NotNull
    public static final TypeHelper<JSONArray> TYPE_HELPER_JSON_ARRAY = new TypeHelper<JSONArray>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_JSON_ARRAY$1

        @NotNull
        private final JSONArray typeDefault = new JSONArray();

        @Override // com.yandex.div.internal.parser.TypeHelper
        @NotNull
        public JSONArray getTypeDefault() {
            return this.typeDefault;
        }

        @Override // com.yandex.div.internal.parser.TypeHelper
        public boolean isTypeValid(@NotNull Object obj) {
            return obj instanceof JSONArray;
        }
    };

    @NotNull
    public static final TypeHelper<JSONObject> TYPE_HELPER_DICT = new TypeHelper<JSONObject>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_DICT$1

        @NotNull
        private final JSONObject typeDefault = new JSONObject();

        @Override // com.yandex.div.internal.parser.TypeHelper
        @NotNull
        public JSONObject getTypeDefault() {
            return this.typeDefault;
        }

        @Override // com.yandex.div.internal.parser.TypeHelper
        public boolean isTypeValid(@NotNull Object obj) {
            return obj instanceof JSONObject;
        }
    };
}
