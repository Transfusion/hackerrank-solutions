--Only fill up the blanks for the function named len
--Do not modify the structure of the template in any other way
len :: [a] -> Int
len l = lenAcc l 0
lenAcc :: [a] -> Int -> Int
lenAcc [] a = a
lenAcc (_:xs) a = lenAcc xs (a + 1)

main = do
		inputdata <- getContents
		putStrLn $ show $ len $ map (read :: String -> Int) $ lines inputdata
