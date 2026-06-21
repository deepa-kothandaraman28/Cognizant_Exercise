DECLARE
    CURSOR c_customers IS
        SELECT customer_id, balance
        FROM customers
        FOR UPDATE;

BEGIN
    FOR rec IN c_customers LOOP
        IF rec.balance > 10000 THEN
            UPDATE customers
            SET isVIP = 'TRUE'
            WHERE CURRENT OF c_customers;
        END IF;
    END LOOP;

    COMMIT;
END;
/