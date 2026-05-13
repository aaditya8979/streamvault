package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.C4706ce;
import io.appmetrica.analytics.impl.Fn;
import java.util.Currency;

/* JADX INFO: loaded from: classes9.dex */
public class Revenue {

    @NonNull
    public final Currency currency;

    @Nullable
    public final String payload;
    public final long priceMicros;

    @Nullable
    public final String productID;

    @Nullable
    public final Integer quantity;

    @Nullable
    public final Receipt receipt;

    public static class Builder {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final Fn f64406g = new Fn(new C4706ce("revenue currency"));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f64407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Currency f64408b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f64409c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f64410d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f64411e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Receipt f64412f;

        private Builder(long j10, Currency currency) {
            f64406g.a(currency);
            this.f64407a = j10;
            this.f64408b = currency;
        }

        public /* synthetic */ Builder(long j10, Currency currency, int i10) {
            this(j10, currency);
        }

        @NonNull
        public Revenue build() {
            return new Revenue(this, 0);
        }

        @NonNull
        public Builder withPayload(@Nullable String str) {
            this.f64411e = str;
            return this;
        }

        @NonNull
        public Builder withProductID(@Nullable String str) {
            this.f64410d = str;
            return this;
        }

        @NonNull
        public Builder withQuantity(@Nullable Integer num) {
            this.f64409c = num;
            return this;
        }

        @NonNull
        public Builder withReceipt(@Nullable Receipt receipt) {
            this.f64412f = receipt;
            return this;
        }
    }

    public static class Receipt {

        @Nullable
        public final String data;

        @Nullable
        public final String signature;

        public static class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f64413a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f64414b;

            private Builder() {
            }

            public /* synthetic */ Builder(int i10) {
                this();
            }

            @NonNull
            public Receipt build() {
                return new Receipt(this, 0);
            }

            @NonNull
            public Builder withData(@Nullable String str) {
                this.f64413a = str;
                return this;
            }

            @NonNull
            public Builder withSignature(@Nullable String str) {
                this.f64414b = str;
                return this;
            }
        }

        private Receipt(Builder builder) {
            this.data = builder.f64413a;
            this.signature = builder.f64414b;
        }

        public /* synthetic */ Receipt(Builder builder, int i10) {
            this(builder);
        }

        @NonNull
        public static Builder newBuilder() {
            return new Builder(0);
        }
    }

    private Revenue(Builder builder) {
        this.priceMicros = builder.f64407a;
        this.currency = builder.f64408b;
        this.quantity = builder.f64409c;
        this.productID = builder.f64410d;
        this.payload = builder.f64411e;
        this.receipt = builder.f64412f;
    }

    public /* synthetic */ Revenue(Builder builder, int i10) {
        this(builder);
    }

    @NonNull
    public static Builder newBuilder(long j10, @NonNull Currency currency) {
        return new Builder(j10, currency, 0);
    }
}
