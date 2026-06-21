DECLARE
    CURSOR c_loans IS
        SELECT l.loan_id, l.customer_id, c.customer_name, l.due_date
        FROM loans l
        JOIN customers c ON l.customer_id = c.customer_id
        WHERE l.due_date BETWEEN SYSDATE AND SYSDATE + 30;

BEGIN
    FOR rec IN c_loans LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Loan ' || rec.loan_id ||
            ' for customer ' || rec.customer_name ||
            ' is due on ' || rec.due_date
        );
    END LOOP;
END;
/