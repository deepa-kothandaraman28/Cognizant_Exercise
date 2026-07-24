CREATE OR REPLACE PROCEDURE TransferFunds(
    p_from_acc IN NUMBER,
    p_to_acc   IN NUMBER,
    p_amount   IN NUMBER
) AS
    v_balance NUMBER;
BEGIN
    SELECT balance
    INTO v_balance
    FROM accounts
    WHERE account_id = p_from_acc
    FOR UPDATE;

    IF v_balance >= p_amount THEN

        UPDATE accounts
        SET balance = balance - p_amount
        WHERE account_id = p_from_acc;

        UPDATE accounts
        SET balance = balance + p_amount
        WHERE account_id = p_to_acc;

        COMMIT;

    ELSE
        DBMS_OUTPUT.PUT_LINE('Insufficient Balance');
    END IF;

EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Account not found');
END;
/