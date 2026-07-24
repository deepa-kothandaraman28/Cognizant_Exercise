DECLARE
    CURSOR c_customers IS
        SELECT customer_id, age, loan_interest_rate
        FROM customers
        FOR UPDATE;

BEGIN
    FOR rec IN c_customers LOOP
        IF rec.age > 60 THEN
            UPDATE customers
            SET loan_interest_rate = loan_interest_rate - 1
            WHERE CURRENT OF c_customers;
        END IF;
    END LOOP;

    COMMIT;
END;
/