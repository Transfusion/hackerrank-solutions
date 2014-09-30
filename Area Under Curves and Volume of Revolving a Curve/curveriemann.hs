import Text.Printf

calculatePoly :: (Floating a, Integral a2, Integral a1) => [a2] -> [a1] -> a -> a
calculatePoly b c a = sum $ map (\x -> (fromIntegral $ fst x) * a ** (fromIntegral $ snd x)) (zip b c)

findArea :: (Enum a, Floating a, Integral a2, Integral a1, Ord a) =>
     a -> a -> [a2] -> [a1] -> a
findArea limitl limitr list1 list2 = 0.001 * (sum $ map (calculatePoly list1 list2) $ [ i*k | i <- [limitl*1000..limitr*1000], k <- [0.001]])

findVolume :: (Enum a, Floating a, Integral a2, Integral a1) => a -> a -> [a2] -> [a1] -> a
findVolume limitl limitr list1 list2 = 0.001 * (sum $ map (\x -> pi * x ** 2) $ map (calculatePoly list1 list2) $ [ i*k | i <- [limitl*1000..limitr*1000], k <- [0.001]])

-- This function should return a list [area, volume].
solve :: Int -> Int -> [Int] -> [Int] -> [Double]
solve l r a b = [ (findArea (fromIntegral l) (fromIntegral r) a b), (findVolume (fromIntegral l) (fromIntegral r) a b) ]
--Input/Output.
main :: IO ()
main = getContents >>= mapM_ (printf "%.1f\n"). (\[a, b, [l, r]] -> solve l r a b). map (map read. words). lines

