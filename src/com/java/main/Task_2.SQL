-- выполняю после истечения времени на задание
SELECT Name, a.Acc_Number, a.Amount
FROM Customer
         INNER JOIN (SELECT Customer_Id, Acc_Number, Amount
                     FROM Account
                              INNER JOIN Fin_Transaction
                                         ON Account.Id = Fin_Transaction.Account_Id
                     WHERE Acc_Number LIKE '45204%') AS a
                    ON a.Customer_Id = Id;