package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.Timestamp;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: TransactionDataKt.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class TransactionDataKt {

    @NotNull
    public static final TransactionDataKt INSTANCE = new TransactionDataKt();

    /* JADX INFO: compiled from: TransactionDataKt.kt */
    @ProtoDslMarker
    public static final class Dsl {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final TransactionEventRequestOuterClass.TransactionData.Builder _builder;

        /* JADX INFO: compiled from: TransactionDataKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(TransactionEventRequestOuterClass.TransactionData.Builder builder) {
                p.k(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(TransactionEventRequestOuterClass.TransactionData.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(TransactionEventRequestOuterClass.TransactionData.Builder builder, i iVar) {
            this(builder);
        }

        public final /* synthetic */ TransactionEventRequestOuterClass.TransactionData _build() {
            TransactionEventRequestOuterClass.TransactionData transactionDataBuild = this._builder.build();
            p.j(transactionDataBuild, "_builder.build()");
            return transactionDataBuild;
        }

        public final void clearEventId() {
            this._builder.clearEventId();
        }

        public final void clearJwsRepresentation() {
            this._builder.clearJwsRepresentation();
        }

        public final void clearProduct() {
            this._builder.clearProduct();
        }

        public final void clearProductId() {
            this._builder.clearProductId();
        }

        public final void clearReceipt() {
            this._builder.clearReceipt();
        }

        public final void clearSignature() {
            this._builder.clearSignature();
        }

        public final void clearTimestamp() {
            this._builder.clearTimestamp();
        }

        public final void clearTransaction() {
            this._builder.clearTransaction();
        }

        public final void clearTransactionId() {
            this._builder.clearTransactionId();
        }

        public final void clearTransactionState() {
            this._builder.clearTransactionState();
        }

        @NotNull
        public final ByteString getEventId() {
            ByteString eventId = this._builder.getEventId();
            p.j(eventId, "_builder.getEventId()");
            return eventId;
        }

        @NotNull
        public final String getJwsRepresentation() {
            String jwsRepresentation = this._builder.getJwsRepresentation();
            p.j(jwsRepresentation, "_builder.getJwsRepresentation()");
            return jwsRepresentation;
        }

        @NotNull
        public final String getProduct() {
            String product = this._builder.getProduct();
            p.j(product, "_builder.getProduct()");
            return product;
        }

        @NotNull
        public final String getProductId() {
            String productId = this._builder.getProductId();
            p.j(productId, "_builder.getProductId()");
            return productId;
        }

        @NotNull
        public final String getReceipt() {
            String receipt = this._builder.getReceipt();
            p.j(receipt, "_builder.getReceipt()");
            return receipt;
        }

        @NotNull
        public final String getSignature() {
            String signature = this._builder.getSignature();
            p.j(signature, "_builder.getSignature()");
            return signature;
        }

        @NotNull
        public final Timestamp getTimestamp() {
            Timestamp timestamp = this._builder.getTimestamp();
            p.j(timestamp, "_builder.getTimestamp()");
            return timestamp;
        }

        @NotNull
        public final String getTransaction() {
            String transaction = this._builder.getTransaction();
            p.j(transaction, "_builder.getTransaction()");
            return transaction;
        }

        @NotNull
        public final String getTransactionId() {
            String transactionId = this._builder.getTransactionId();
            p.j(transactionId, "_builder.getTransactionId()");
            return transactionId;
        }

        @NotNull
        public final TransactionEventRequestOuterClass.TransactionState getTransactionState() {
            TransactionEventRequestOuterClass.TransactionState transactionState = this._builder.getTransactionState();
            p.j(transactionState, "_builder.getTransactionState()");
            return transactionState;
        }

        public final int getTransactionStateValue() {
            return this._builder.getTransactionStateValue();
        }

        public final boolean hasJwsRepresentation() {
            return this._builder.hasJwsRepresentation();
        }

        public final boolean hasReceipt() {
            return this._builder.hasReceipt();
        }

        public final boolean hasSignature() {
            return this._builder.hasSignature();
        }

        public final boolean hasTimestamp() {
            return this._builder.hasTimestamp();
        }

        public final void setEventId(@NotNull ByteString byteString) {
            p.k(byteString, "value");
            this._builder.setEventId(byteString);
        }

        public final void setJwsRepresentation(@NotNull String str) {
            p.k(str, "value");
            this._builder.setJwsRepresentation(str);
        }

        public final void setProduct(@NotNull String str) {
            p.k(str, "value");
            this._builder.setProduct(str);
        }

        public final void setProductId(@NotNull String str) {
            p.k(str, "value");
            this._builder.setProductId(str);
        }

        public final void setReceipt(@NotNull String str) {
            p.k(str, "value");
            this._builder.setReceipt(str);
        }

        public final void setSignature(@NotNull String str) {
            p.k(str, "value");
            this._builder.setSignature(str);
        }

        public final void setTimestamp(@NotNull Timestamp timestamp) {
            p.k(timestamp, "value");
            this._builder.setTimestamp(timestamp);
        }

        public final void setTransaction(@NotNull String str) {
            p.k(str, "value");
            this._builder.setTransaction(str);
        }

        public final void setTransactionId(@NotNull String str) {
            p.k(str, "value");
            this._builder.setTransactionId(str);
        }

        public final void setTransactionState(@NotNull TransactionEventRequestOuterClass.TransactionState transactionState) {
            p.k(transactionState, "value");
            this._builder.setTransactionState(transactionState);
        }

        public final void setTransactionStateValue(int i10) {
            this._builder.setTransactionStateValue(i10);
        }
    }

    private TransactionDataKt() {
    }
}
