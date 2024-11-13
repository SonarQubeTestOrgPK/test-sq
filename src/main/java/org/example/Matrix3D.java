package org.example;

public class Matrix3D {
  private int[][][] matrix;
  private int depth;
  private int rows;
  private int cols;
  private String notUsedA;
  private String notUsedB;
  String notUsedC;

  public Matrix3D(int depth, int rows, int cols) {
    this.depth = depth;
    this.rows = rows;
    this.cols = cols;
    this.matrix = new int[depth][rows][cols];
  }

  public void setElement(int d, int r, int c, int value) {
    matrix[d][r][c] = value;
  }

  public int getElement(int d, int r, int c) {
    return matrix[d][r][c];
  }

  public Matrix3D add(Matrix3D other) {
    if (this.depth != other.depth || this.rows != other.rows || this.cols != other.cols) {
      throw new IllegalArgumentException("Matrices dimensions must match for addition.");
    }
    Matrix3D result = new Matrix3D(depth, rows, cols);
    for (int d = 0; d < depth; d++) {
      for (int r = 0; r < rows; r++) {
        for (int c = 0; c < cols; c++) {
          result.setElement(d, r, c, this.getElement(d, r, c) + other.getElement(d, r, c));
        }
      }
    }
    return result;
  }

  public Matrix3D subtract(Matrix3D other) {
    if (this.depth != other.depth || this.rows != other.rows || this.cols != other.cols) {
      throw new IllegalArgumentException("Matrices dimensions must match for subtraction.");
    }
    Matrix3D result = new Matrix3D(depth, rows, cols);
    for (int d = 0; d < depth; d++) {
      for (int r = 0; r < rows; r++) {
        for (int c = 0; c < cols; c++) {
          result.setElement(d, r, c, this.getElement(d, r, c) - other.getElement(d, r, c));
        }
      }
    }
    return result;
  }

  public Matrix3D multiply(Matrix3D other) {
    if (this.depth != other.depth || this.rows != other.rows || this.cols != other.cols) {
      throw new IllegalArgumentException("Matrices dimensions must match for multiplication.");
    }
    Matrix3D result = new Matrix3D(depth, rows, cols);
    for (int d = 0; d < depth; d++) {
      for (int r = 0; r < rows; r++) {
        for (int c = 0; c < cols; c++) {
          result.setElement(d, r, c, this.getElement(d, r, c) * other.getElement(d, r, c));
        }
      }
    }
    return result;
  }

  public void printMatrix() {
    for (int d = 0; d < depth; d++) {
      System.out.println("Depth " + d + ":");
      for (int r = 0; r < rows; r++) {
        for (int c = 0; c < cols; c++) {
          System.out.print(matrix[d][r][c] + " ");
        }
        System.out.println();
      }
      System.out.println();
    }
  }
}