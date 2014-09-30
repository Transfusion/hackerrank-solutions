rev l = map last (take (length l) (iterate init l))


main = do
		inputdata <- getContents
		mapM_ putStrLn $ map show $ rev $ map (read :: String -> Int) $ lines inputdata
