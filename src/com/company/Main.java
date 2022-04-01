package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        task42();
        task67();
        task92();
        task117();
        task142();
    }
    /*
    Радномайзер массива
     */
    public static void ArrGen(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = (int) (Math.random() * 9 + 2);
        }
    }
    /*
    42 Пригодность детали оценивается по размеру В, который должен лежать в интервале (А – δ, А + δ).
    Определить, имеются ли в партии из N деталей бракованные. Если да, то подсчитать их количество, в противном случае выдать отрицательный ответ.
     */
    private static void task42()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ideal size: ");
        int ideal = scanner.nextInt();
        System.out.println("Enter the deviation: ");
        int dev = scanner.nextInt();

        int[] arr = new int[100];
        int count = 0;
        ArrGen(arr);
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] >= ideal - dev && arr[i] <= ideal + dev)
            {
                System.out.println("Good " + arr[i]);
            }
            else
            {
                count++;
                System.out.println("Bad " + arr[i]);
            }
        }
        System.out.println("Bad elem: " + count);
    }
    /*
   67 Найти сумму всех элементов массива целых чисел, удовлетворяющих условию: остаток от деления на 3 равен 2
     */
    private static void task67()
        {
            int[] arr = new int[100];
            int sum = 0;
            ArrGen(arr);
            for(int i = 0; i < arr.length; i++)
            {
                if (arr[i] % 3 == 2)
                {
                    sum += arr[i];
                }
            }
            System.out.println(sum);
        }
        /*
       92 Удалить k-й элемент массива целых чисел A(50).
         */
    private static void task92()
    {
        int [] arr = new int[50];
        ArrGen(arr);
        int k = (int) (Math.random() * 50);
        int[] copy = new int[arr.length];
        System.out.println(k);
        System.out.println(Arrays.toString(arr));
        for (int i = 0, j = 0; i < arr.length; i++)
        {
            if(i == (arr.length - 1))
            {
                arr[i] = 0;
                break;
            }
            if (i != k) {
                copy[j++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(copy));
    }
    /*
   117 Задан массив. Создать два массива, в одном из которых находятся все четные по номеру элементы, в другом нечетные по номеру элементы массива.
     */
    private static void task117()
    {
        int size = 100;
        int[] arr = new int[size];
        ArrGen(arr);
        if(size % 2 == 1)
        {
            size ++;
        }
        int[] even = new int[size/2];
        int[] odd = new int[size/2];
        for (int i = 0, j = 0, k = 0; i < arr.length; i++)
        {
            if(i % 2 == 0)
            {
                odd[j++] = arr[i];
            }
            else
            {
                even[k++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(even));
        System.out.println(Arrays.toString(odd));
    }
    /*
   142 Дана последовательность вещественных чисел а1, а2, ..., an.
    Требуется умножить все члены последовательности а1, а2, ..., an на квадрат ее наименьшего члена, если аk ≥ 0
     */
    private static void task142()
    {
        int size = 100;
        int[] arr = new int[size];
        int[] result = new int[size];
        ArrGen(arr);
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++)
        {
            result[i] = arr[i] * (min * min);
        }
        System.out.println(min);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(result));
    }
}
